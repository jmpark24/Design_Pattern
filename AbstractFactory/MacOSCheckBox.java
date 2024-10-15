package AbstractFactory;

public class MacOSCheckBox extends CheckBox {
  public MacOSCheckBox(boolean bChecked) {
    super(bChecked);
  }

  @Override
  public void render() {
    System.out.println(
        "MacOS 렌더링 API를 이용해 "
            + (this.bChecked ? "체크된" : "체크 안된")
            + " 체크 박스를 그립니다.");
  }

}
