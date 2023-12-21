
/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

public class PhraseSolver {
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private Boolean solved;

  /* your code here - constructor(s) */

  public PhraseSolver()
  {
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;
  }

  /* your code here - accessor(s) */

  /* your code here - mutator(s) */

  public void play() {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);

    boolean correct = true;
    while (!solved) {

      /* your code here - game logic */

      /* your code here - determine how game ends */
      solved = true;
    }

    System.out.println("Player1: " + player1.getName());
    System.out.println("Player1 points: " + player1.getPoints());
    System.out.println("Player2: " + player2.getName());
    System.out.println("Player2 points: " + player2.getPoints());
    System.out.println("Phrase: " + game.getPhrase());
    System.out.println("Letter Value: " + game.getLetterValue());
    System.out.println("Solved Phrase: " + game.getSolvedPhrase());
  }

}