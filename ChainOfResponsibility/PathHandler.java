package ChainOfResponsibility;

public class PathHandler extends Handler {

  @Override
  protected void process(String url) {
    int index = url.lastIndexOf("/");
    if (index != -1) {
      String strPath = url.substring(index + 1);
      try {
        String path = strPath;
        System.out.println("PATH: " + path);
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else
      System.out.println("NO PATH");
  }

}
