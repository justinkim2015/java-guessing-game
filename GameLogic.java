import java.util.Scanner;

public class GameLogic {
  public void playGame() {
    // Set up game
    Computer comp = new Computer();
    Player playerOne = new Player();
    Scoreboard board = new Scoreboard();
    System.out.println(playerOne.getName());

    // Start game
    board.incTurn();
    guess();
    System.out.println(comp.getNum());
    System.out.println(board.getCount());
  }

  private static void guess() {

  }
}
