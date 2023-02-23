import java.util.Scanner;

public class GameLogic {
  private  Computer comp = new Computer();
  private  Player playerOne = new Player();
  private Scoreboard board = new Scoreboard();
  private Scanner sc = new Scanner(System.in);

  public void playGame() {
    System.out.println("Round " + board.getCount() + " - " + playerOne.getLives() + " lives!");
    System.out.println("-------");

    System.out.println("Input a number!");
    if (sc.hasNextInt()) {
      int number = sc.nextInt();

      if(guess(number) == true) {
        System.out.println("\nYou win!");
        System.out.println("It took you " + board.getCount() + " turns!");
      } else {
        playerOne.decLives();
        if (isGameOver() == true) {
          System.out.println("\nYou're out of lives! The answer was " + comp.getNum());
          return;
        };
        giveHint(number);
        board.incTurn();
        playGame();
      }  
    } else if(sc.hasNext()){
      String input = sc.nextLine();
      if (input.equals("hint") && playerOne.givenHint() == false) {
        comp.giveHint();
        playerOne.hintGiven();
        playGame();
      } else {
        System.out.println("\nYou're outta hints!\n");
        playGame();
      }
    }

    sc.close();
  }

  private boolean isGameOver() {
    if (playerOne.getLives() == 0) {
      return true;
    } else {
      return false;
    }
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
