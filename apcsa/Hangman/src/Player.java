
/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player {
  /* your code here - attributes */
  private String name;
  private int points;

  /* your code here - constructor(s) */

  public Player() 
  {
    name = "";
    points = 0; 
    System.out.println("Enter Player Name: ");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();

    name = newName;
    System.out.println("Hello and welcome to the game, " + name);
  }

  public Player(String inputName)
  {
    name = newName;
    points = 0;
    System.out.println("Hello and welcome to the game, " + name);
  }

  public String getName() { /* incomplete  */}

  public void setName(String inputName) {/* incomplete */}

  public int getPoints() { /* incomplete */}

  public void addToPoints(int value) { /* incomplete */}
  /* your code here - accessor(s) */

  /* your code here - mutator(s) */
}