import java.util.Scanner;

public class Player {
  private String name;
  private int lives;

  public Player() {
    setName();
    lives = 5;
  }

  public void decLives() {
    lives -= 1;
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
