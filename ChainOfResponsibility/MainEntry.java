package ChainOfResponsibility;

public class MainEntry {
  public static void main(String[] args) {
    Handler handler1 = new ProtocolHandler();
    Handler handler2 = new DomainHandler();
    Handler handler3 = new PortHandler();
    Handler handler4 = new PathHandler();

    handler1.setNext(handler2).setNext(handler3).setNext(handler4);

    String url = "http://www.youtube.com:1007/admin";
    System.out.println("INPUT: " + url);

    handler1.run(url);
  }
}
