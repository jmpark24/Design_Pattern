# Adapter 패턴

Adapter 패턴은 서로 다른 인터페이스를 가진 클래스들을 함께 사용할 수 있도록 하는 패턴입니다. 이 패턴의 주요 특징은 다음과 같습니다:

- 클래스의 인터페이스를 다른 인터페이스로 변환하여 함께 작동하도록 해줍니다.
- 구조가 다른 클래스를 기존 시스템에 통합할 때 유용합니다.

## 구현

### Animal 추상 클래스

```java
package Adapter;

public abstract class Animal {
  protected String name;

  public Animal(String name) {
    this.name = name;
  }

  public abstract void sound();
}
```

### Dog 클래스

```java
package Adapter;

public class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }

  @Override
  public void sound() {
    System.out.println(name + " Barking");
  }
}
```

### Cat 클래스

```java
package Adapter;

public class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  @Override
  public void sound() {
    System.out.println(name + " Meow");
  }
}
```

### Tiger 클래스 (변경 불가능한 기존 클래스)

```java
package Adapter;

public class Tiger {
  private String name;

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  void roar() {
    System.out.println("growl");
  }
}
```

### TigerAdapter 클래스

```java
package Adapter;

public class TigerAdapter extends Animal {
  private Tiger tiger;

  public TigerAdapter(String name) {
    super(name);
    tiger = new Tiger();
    tiger.setName(name);
  }

  @Override
  public void sound() {
    System.out.print(tiger.getName() + " ");
    tiger.roar();
  }
}
```

### 메인 클래스 (User)

```java
package Adapter;
import java.util.ArrayList;

public class User {
  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(new Dog("댕이"));
    animals.add(new Cat("솜털이"));
    animals.add(new Cat("츄츄"));
    animals.add(new TigerAdapter("타이온"));

    animals.forEach(animal -> {
      animal.sound();
    });
  }
}
```

## Adapter 패턴의 장점

1. 기존 코드를 변경하지 않고도 새로운 클래스를 기존 시스템에 통합할 수 있습니다.
2. 클래스 간의 종속성을 줄이고 코드의 재사용성을 높입니다.
3. 클라이언트 코드의 일관성을 유지할 수 있습니다.

## 결론

Adapter 패턴을 사용하면 변경할 수 없는 클래스를 원하는 형태의 인터페이스나 클래스로 사용할 수 있습니다. 이는 레거시 코드와 새로운 코드를 통합하거나, 서로 다른 라이브러리를 함께 사용해야 할 때 특히 유용합니다.

---

이 내용은 [유튜브 강의](https://www.youtube.com/watch?v=7MSzyqhrO-A&list=PLe6NQuuFBu7FhPfxkjDd2cWnTy2y_w_jZ&index=5)를 바탕으로 작성되었습니다.