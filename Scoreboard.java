public class Scoreboard {
  private int turnCount;

  public Scoreboard() {
    turnCount = 1;
  }

  public void incTurn() {
    turnCount += 1;
  }

  public int getCount() {
    return turnCount;
  }
}
