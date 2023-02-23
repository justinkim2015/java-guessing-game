public class Computer {
  private int randomNumber;

  public Computer() {
    double random = Math.random() * 100;
    randomNumber = (int) random;
  }

  public int getNum() {
    return randomNumber;
  }

  public void giveHint() {
    if (randomNumber > 50) {
      System.out.println("\nI'm thinking of a number above 50\n");
    } else {
      System.out.println("\nI'm thinking of a number below 50\n");
    }
  }
}
