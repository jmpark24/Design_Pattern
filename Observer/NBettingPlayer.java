package Observer;

public class NBettingPlayer extends Player {
  private int bettingNumber;

  public NBettingPlayer(String name, int bettingNumber) {
    super(name);
    this.bettingNumber = bettingNumber;
  }

  @Override
  public void update(int diceNumber) {
    if (diceNumber == bettingNumber) {
      System.out.println(getName() + " 숫자 맞추기 win!");
    }
  }

}
