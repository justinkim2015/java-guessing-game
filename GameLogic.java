import java.util.Scanner;

public class GameLogic {
  private  Computer comp = new Computer();
  private  Player playerOne = new Player();
  private Scoreboard board = new Scoreboard();
  private Scanner sc = new Scanner(System.in);

  public void playGame() {
    System.out.println(playerOne.getName());
    board.incTurn();
    System.out.println(comp.getNum());
    if(guess() == true) {
      System.out.println("You win!");
    }

    sc.close();
  }

  private boolean guess() {
    System.out.println("Input a number!");
    
    int number = sc.nextInt();
    if(number == comp.getNum()) {
      return true;
    } else {
      return false;  
    }
  }
}
