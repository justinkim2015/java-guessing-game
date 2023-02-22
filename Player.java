import java.util.Scanner;

public class Player {
  private String name;

  public Player() {
    setName();
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
