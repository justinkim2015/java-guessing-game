public class Main {
  public static void main(String[] args) {
    GameLogic game = new GameLogic();
    String instructions = "Please guess a number from 1 to 100!  At any time, type 'hint' for a hint, you only get one!";

    System.out.println("\n" +instructions + "\n");
    
    game.playGame();
  }
}