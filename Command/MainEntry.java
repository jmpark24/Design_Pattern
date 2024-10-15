package Command;

public class MainEntry {
  public static void main(String[] args) {
    CommandGroup cmdGroup = new CommandGroup();

    Command clearCmd = new ClearCommand();
    // clearCmd.run();
    cmdGroup.add(clearCmd);

    Command yellowColorCmd = new ColorCommand(ColorCommand.Color.YELLOW);
    // yellowColorCmd.run();
    cmdGroup.add(yellowColorCmd);

    Command moveCmd = new MoveCommand(10, 1);
    // moveCmd.run();
    cmdGroup.add(moveCmd);

    Command printCmd = new PrintCommand("안녕하세요! 디자인패턴!");
    // printCmd.run();
    cmdGroup.add(printCmd);

    Command moveCmd2 = new MoveCommand(15, 5);
    // moveCmd2.run();
    cmdGroup.add(moveCmd2);

    // printCmd.run();
    cmdGroup.add(printCmd);

    Command moveCmd3 = new MoveCommand(25, 8);
    moveCmd3.run();
    cmdGroup.add(moveCmd3);

    Command greenColorCmd = new ColorCommand(ColorCommand.Color.GREEN);
    // greenColorCmd.run();
    cmdGroup.add(greenColorCmd);

    // printCmd.run();
    cmdGroup.add(printCmd);

    cmdGroup.run();
  }
}
