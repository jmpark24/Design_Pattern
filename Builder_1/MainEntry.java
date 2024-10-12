package Builder_1;

import java.util.Random;

public class MainEntry {
  public static void main(String[] args) {
    Car car1 = new Car("V7", true, "Black", true, false);

    // Car car2 = new CarBuilder()
    // .setAEB(false)
    // .setAirbag(false)
    // .setCameraSensor(true)
    // .setColor("White")
    // .setEngine("V9")
    // .build();

    CarBuilder builder = new CarBuilder()
        .setAEB(false)
        // .setAirbag(false)
        .setCameraSensor(true)
        .setColor("White")
        .setEngine("V9");
    // .build();

    Random random = new Random();
    Car car2 = builder
        .setAirbag(random.nextInt(2) == 0)
        .build();

    System.out.println(car1);
    System.out.println(car2);

  }
}
