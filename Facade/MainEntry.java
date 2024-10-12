package Facade;

public class MainEntry {
  public static void main(String[] args) {
    // DBMS dbms = new DBMS();
    // Cache cache = new Cache();

    // String name = "Dorosh";
    // Row row = cache.get(name);
    // if (row == null) {
    // row = dbms.query(name);
    // if (row != null) {
    // cache.put(row);
    // }
    // }
    // if (row != null) {
    // Message message = new Message(row);

    // System.out.println(message.makeName());
    // System.out.println(message.makeBirthday());
    // System.out.println(message.makeEmail());

    // } else {
    // System.out.println(name + " is not exists.");
    // }

    Facade facade = new Facade();

    String name = "Dorosh";

    facade.run(name);
    facade.run(name);
  }
}
