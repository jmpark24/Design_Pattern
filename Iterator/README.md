# Iterator 패턴

Iterator 패턴은 내부 구현을 노출시키지 않고 집약된 객체에 접근하고 싶은 경우에 적용하는 패턴입니다. 이 패턴을 사용하면 다음과 같은 이점이 있습니다:

- 집합 객체에 대해 다양한 탐색 경로를 사용할 수 있습니다.
- 서로 다른 집합 객체 구조에 대해서도 동일한 방법으로 접근할 수 있습니다.

동일한 형태의 데이터 항목을 여러 개 가지고 있는 것을 `Container` 또는 `Aggregator`라고 합니다. Iterator 패턴은 다양한 데이터를 동일한 방식으로 가져오는 방법을 제공합니다.

## 클래스 다이어그램

클래스 다이어그램에서 Aggregator는 Iterator 객체를 생성합니다. `iterator()` 메소드가 Iterator 객체를 만들어서 반환합니다.

## 인터페이스 및 클래스 구현

### Aggregator 인터페이스

```java
public interface Aggregator {
    Iterator iterator();
}
```

### Iterator 인터페이스

```java
public interface Iterator {
    boolean next();
    Object current();
}
```

- `next()`: Aggregator의 다음 구성 데이터를 얻을 수 있는지 여부를 반환 (가능하면 true, 불가능하면 false)
- `current()`: 구성 데이터를 하나 얻어 반환 (Object 타입으로 선언)

### Item 클래스

```java
public class Item {
    private String name;
    private int cost;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + cost + ")";
    }
}
```

### Array 클래스 (Aggregator 구현)

```java
public class Array implements Aggregator {
    private Item[] items;

    public Array(Item[] items) {
        this.items = items;
    }

    public Item getItem(int index) {
        return items[index];
    }

    public int getCount() {
        return items.length;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }
}
```

### ArrayIterator 클래스 (Iterator 구현)

```java
public class ArrayIterator implements Iterator {
    private Array array;
    private int index;

    public ArrayIterator(Array array) {
        this.array = array;
        this.index = -1;
    }

    @Override
    public boolean next() {
        index++;
        return index < array.getCount();
    }

    @Override
    public Object current() {
        return array.getItem(index);
    }
}
```

### 메인 클래스

```java
public class MainEntry {
    public static void main(String[] args) {
        Item[] items = {
            new Item("CPU", 1000),
            new Item("Keyboard", 2000),
            new Item("Mouse", 3000),
            new Item("HDD", 50),
        };

        Array array = new Array(items);
        Iterator it = array.iterator();

        while (it.next()) {
            Item item = (Item) it.current();
            System.out.println(item);
        }
    }
}
```

## Iterator 패턴의 핵심

Iterator 패턴의 핵심은 배열, 링크드 리스트, 트리 등 다양한 형태의 컨테이너(Aggregator)의 구성 데이터를 참조할 수 있는 표준화된 공통 API를 제공하는 것입니다. 이를 통해 개발자는 다양한 데이터 구조를 파악하지 않아도 표준화된 하나의 API만으로 다양한 구조의 Aggregator 데이터를 참조할 수 있습니다.

---

이 내용은 [유튜브 강의](https://www.youtube.com/watch?v=T3sXKtlr0Ow&list=PLe6NQuuFBu7FhPfxkjDd2cWnTy2y_w_jZ&index=2)를 바탕으로 작성되었습니다.