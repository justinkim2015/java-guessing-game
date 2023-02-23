import java.util.Scanner;

public class Player {
  private String name;
  private int lives;
  private boolean hint;

  public Player() {
    setName();
    lives = 5;
    hint = false;
  }

  public void hintGiven() {
    hint = true;
  }

  public boolean givenHint() {
    return hint;
  }

  public void decLives() {
    lives -= 1;
  }

  public int getLives() {
    return lives;
  }

  private void setName() {
    Scanner sc = new Scanner(System.in);
    System.out.println("What's your name?");
    name = sc.nextLine();
  }

  public String getName() {
    return name;
  }
}
