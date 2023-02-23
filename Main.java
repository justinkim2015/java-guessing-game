public class Main {
  public static void main(String[] args) {
    GameLogic game = new GameLogic();
    String instructions = "Please guess a number from 1 to 100!";

    System.out.println("\n" +instructions + "\n");
    
    game.playGame();
  }
}