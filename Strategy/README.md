# Strategy 패턴

Strategy 패턴은 문제 해결에 있어 다양한 알고리즘이 적용될 수 있는 경우에 알고리즘을 별도로 분리하는 패턴입니다. 이 패턴의 주요 특징은 다음과 같습니다:

- 특정 객체에 종속되지 않습니다.
- 알고리즘에 대한 확장과 변경이 용이합니다.

## 패턴 구조

- `SumPrinter`: 출력을 담당하는 클래스
- `SumStrategy`: 합계 계산 알고리즘을 정의하는 인터페이스
- `SimpleSumStrategy`, `GaussSumStrategy`: 실제 알고리즘을 구현하는 클래스들

이 구조를 통해 필요에 따라 일련의 동작 중에서 다른 알고리즘을 적용하여 동작할 수 있습니다.

## 장점

새로운 알고리즘을 `SumStrategy`를 통해 구현해도, `SumPrinter`는 실제 알고리즘에 대한 정보를 가지고 있지 않기 때문에 `SumPrinter`의 사용 방식이 바뀌지 않습니다.

## 구현

### SumPrinter 클래스

```java
public class SumPrinter {
  public void print(SumStrategy strategy, int N) {
    System.out.printf("The Sum of 1 - %d : ", N);
    System.out.println(strategy.get(N));
  }
}
```

### SumStrategy 인터페이스

```java
public interface SumStrategy {
  int get(int N);
}
```

### SimpleSumStrategy 클래스

```java
public class SimpleSumStrategy implements SumStrategy {
    @Override
    public int get(int N) {
      int sum = N;
      for(long i=1; i<N; i++) {
        sum += i;
      }
      return sum;
    }
}
```

### GaussSumStrategy 클래스

```java
public class GaussSumStrategy implements SumStrategy {
  @Override
  public int get(int N) {
    return (N+1)*N/2;
  }
}
```

### 메인 클래스

```java
public class MainEntry {
  public static void main(String[] args) {
    SumPrinter cal = new SumPrinter();
    cal.print(new SimpleSumStrategy(), 10);
    cal.print(new GaussSumStrategy(), 10);
  }
}
```

## 결론

Strategy 패턴을 사용하면 하나의 기능에 대해 서로 다른 방식의 구현을 실행 중에 변경할 수 있습니다. 이는 코드의 유연성과 확장성을 크게 향상시킵니다.

---

이 내용은 [유튜브 강의](https://www.youtube.com/watch?v=Wao5HiXM_Cg&list=PLe6NQuuFBu7FhPfxkjDd2cWnTy2y_w_jZ&index=3)를 바탕으로 작성되었습니다.