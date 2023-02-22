public class Scoreboard {
  private int turnCount;

  public void incTurn() {
    turnCount += 1;
  }

  public int getCount() {
    return turnCount;
  }
}
