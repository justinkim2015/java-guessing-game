import java.util.Scanner;

public class GameLogic {
  private  Computer comp = new Computer();
  private  Player playerOne = new Player();
  private Scoreboard board = new Scoreboard();
  private Scanner sc = new Scanner(System.in);

  public void playGame() {
    board.incTurn();
    System.out.println("Round " + board.getCount());
    System.out.println("-------");

    System.out.println("Input a number!");
    int number = sc.nextInt();

    if(guess(number) == true) {
      System.out.println("You win!");
      System.out.println("It took you " + board.getCount() + " turns!");
    } else {
      giveHint(number);
      playGame();
    }

    sc.close();
  }

  private void giveHint(int guess) {
    if(guess > comp.getNum()) {
      System.out.println("It's lower! \n");
    } else {
      System.out.println("It's higher! \n");
    }
  }

  private boolean guess(int number) {
    if(number == comp.getNum()) {
      return true;
    } else {
      return false;  
    }
  }
}
