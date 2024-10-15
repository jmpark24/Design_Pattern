package AbstractFactory;

public class MacOSTextEdit extends TextEdit {
  public MacOSTextEdit(String value) {
    super(value);
  }

  @Override
  public void render() {
    System.out.println(
        "MacOS 렌더링 API를 이용해 "
            + this.value + " 값을 가진"
            + " 텍스트에디트를 그립니다.");
  }

}
