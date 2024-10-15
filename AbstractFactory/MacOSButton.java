package AbstractFactory;

public class MacOSButton extends Button {
  public MacOSButton(String caption) {
    super(caption);
  }

  @Override
  public void render() {
    System.out.println(
        "MacOS 렌더링 API를 이용해 "
            + this.caption
            + " 버튼을 그립니다.");
  }

}
