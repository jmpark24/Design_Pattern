package Observer;

public class MainEntry {
  public static void main(String[] args) {
    DiceGame diceGame = new FairDiceGame();

    Player player1 = new EvenBettingPlayer("짝궁댕이");
    Player player2 = new OddBettingPlayer("홀아비");
    Player player3 = new OddBettingPlayer("홀쭉이");

    diceGame.addPlayer(player1);
    diceGame.addPlayer(player2);
    diceGame.addPlayer(player3);

    for (int i = 0; i < 5; i++) {
      diceGame.play();
      System.out.println();
    }

    DiceGame uDiceGame = new UnfairDiceGame();

    Player player4 = new NBettingPlayer("짝궁댕이2", 3);
    Player player5 = new NBettingPlayer("홀아비2", 4);
    Player player6 = new NBettingPlayer("홀쭉이2", 5);
    uDiceGame.addPlayer(player4);
    uDiceGame.addPlayer(player5);
    uDiceGame.addPlayer(player6);

    for (int i = 0; i < 5; i++) {
      uDiceGame.play();
      System.out.println();
    }
  }
}
