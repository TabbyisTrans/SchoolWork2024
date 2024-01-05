
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

  /**
   * guides the players through creating a new player, and allows them to type in the name
   */
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
  /**
   *Creates a player with the name provided in inputName 
   *@param String inputName 
   */
  public Player(String inputName)
  {
    name = inputName;
    points = 0;
    System.out.println("Hello and welcome to the game, " + name);
  }
  /**
   * Returns name of the player
   *@return name
   */
  public String getName() 
  {
    return name;
  }

  /**
   * Sets name to the string given
   * @param String inputName
   */
  public void setName(String inputName)
  {
    name = inputName;
  } 

  /**
   * provides the points for a character
   * @return points
   */
  public int getPoints() 
  {
    return points;
  }

  /**
   * adds the amount of points given to the players total
   * @param int value
   */
  public void addToPoints(int value) 
  {
    points += value;
  }

  /* your code here - accessor(s) */

  /* your code here - mutator(s) */
}