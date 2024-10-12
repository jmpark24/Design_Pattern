package ChainOfResponsibility;

public class PortHandler extends Handler {

  @Override
  protected void process(String url) {
    int startIndex = url.lastIndexOf(":");
    int lastIndex = url.lastIndexOf("/");

    System.out.print("PORT: ");
    if (startIndex == -1) {
      if (lastIndex == -1) {
        System.out.println(url);
      } else {
        System.out.println(url.substring(0, lastIndex));
      }
    } else if (startIndex != lastIndex) {
      System.out.println(url.substring(startIndex + 1, lastIndex));
    } else if (startIndex == lastIndex) {
      System.out.println(url.substring(startIndex));
    } else {
      System.out.println("NONE");
    }

  }

}
