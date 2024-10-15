package AbstractFactory;

public class MacOSFactory extends ComponentFactory {

  @Override
  public Button createButton(String caption) {
    return new MacOSButton(caption);
  }

  @Override
  public CheckBox createCheckBox(boolean bChecked) {
    return new MacOSCheckBox(bChecked);
  }

  @Override
  public TextEdit createTextEdit(String value) {
    return new MacOSTextEdit(value);
  }

}
