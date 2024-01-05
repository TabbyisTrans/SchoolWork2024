
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

public void play()
  {
    int currentPlayer = 1; // set current player to Player 1
    Scanner sc = new Scanner(System.in);
    boolean correct = true;
    while (!solved)  // stop the game if the phrase is solved 
    {
      correct = true;
      while (correct)
      {
        //**SET LETTER VALUE**//
        game.setLetterValue();
        //**DISPLAY BOARD AND LETTER VALUE**//
        System.out.println(game.getSolvedPhrase());
        System.out.println(player1.getName() + " Points: " + player1.getPoints());
        System.out.println(player2.getName() + " Points: " + player2.getPoints());
        System.out.println("Letter Value: " + game.getLetterValue()); 
        //** PROMPT THE CURRENT PLAYER FOR A GUESS**//
        if (currentPlayer == 1)
        {
          System.out.println(player1.getName() + " guess: ");
        }
        if (currentPlayer == 2)
        {
          System.out.println(player2.getName() + " guess: ");
        }
        // **CHECK TO SEE IF THE PHRASE IS SOLVED**//
        String guess = sc.nextLine();
        solved = game.isSolved(guess);
        //**CHECK TO SEE IF THE LETTER IS IN THE PHRASE**//
        correct = game.guessLetter(guess);
        if (correct && !solved)
        {
          if (currentPlayer == 1)
          {
            player1.addToPoints(game.getLetterValue());
          }
          if (currentPlayer == 2)
          {
            player2.addToPoints(game.getLetterValue());
          }
        } 
        //**IF GUESS CORRECT AND NOT SOLVED, ADD POINTS TO CURRENT PLAYER**//

      } // end of while (correct)

      // **SWITCH CURRENT PLAYER
      if (currentPlayer == 1)
      {
        currentPlayer = 2;
      }
      else
      {
        currentPlayer = 1;
      }
    } //end of while (!solved)
   
    //** PRINT RESULTS
    System.out.println(player1.getPoints());
    System.out.println(player2.getPoints());
  } //end of play

}