import java.util.Scanner;

public class Player {
  private String name;

  public Player() {
    Scanner sc = new Scanner(System.in);
    System.out.println("What's your name?");
    name = sc.nextLine();

    sc.close();
  }

  public String getName() {
    return name;
  }
}
