public class Computer {
  private int randomNumber;

  public Computer() {
    double random = Math.random() * 100;
    randomNumber = (int) random;
  }

  public int getNum() {
    return randomNumber;
  }
}
