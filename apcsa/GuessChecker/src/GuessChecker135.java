/*
 * Activity 1.3.2
 */
import java.util.Scanner;
 
public class GuessChecker135
{
	public static void main(String[] args)
	{
    /* Add any variables you will need throughout the program here. */
  
    // Generate the random number
    String targetStr = makeCode();
    //System.out.println(targetStr);  // uncomment for debugging
    
    // Break the random number into four variables.
    int r1 = Integer.parseInt(targetStr.substring(0, 1));
    int r2 = Integer.parseInt(targetStr.substring(1, 2));
    int r3 = Integer.parseInt(targetStr.substring(2, 3));
    int r4 = Integer.parseInt(targetStr.substring(3, 4));
    
    // Get the user's guess.
    String guess = getGuess();
    //System.out.println(guess);   // uncomment for debugging
    
    // Break the user's guess into four variables.
    int g1 = Integer.parseInt(guess.substring(0, 1));
    int g2 = Integer.parseInt(guess.substring(1, 2));
    int g3 = Integer.parseInt(guess.substring(2, 3));
    int g4 = Integer.parseInt(guess.substring(3, 4));

    /*your code here*/
    int hits = 0;
    int nearHits = 0;

    if (g1 == r1) 
    {
      hits = hits+1;
    }

      else if (g1 == r2 || g1 == r3 || g1 == r4) 
      {
        nearHits ++;
      }
    
    
    if (g2 == r2) {
      hits = hits+1;
    }


      else if (g2 == r3 || g2 == r4 || g2 == r1) 
      {
        nearHits ++;
      }

    
    if (g3 == r3) 
    {
      hits = hits+1;
    }

      else if (g3 == r4 || g3 == r1 || g3 == r2) 
      {
        nearHits ++;
      }
    

    if (g4 == r4) 
    {
      hits = hits+1;
    }


    else if (g4 == r1 || g4 == r2 || g4 == r3) 
    {
        nearHits ++;
    }
    

    System.out.println("hits: " + hits);
    System.out.println("near hits: " + nearHits);
	
    }

 
  // Checks to ensure no duplicate digits in a int.
	public static boolean hasDupes(int num)
	{ 
		boolean[] digs = new boolean[10];
		while (num > 0)
		{
			if (digs[num % 10])
			  return true;
			digs[num % 10] = true;
			num /= 10;
		}
		return false;
	}

  // Creates a new random 4 digit code 1000-9999 with no duplicates.
  public static String makeCode() 
  { 
		int target = (int) (Math.random() * 9000 + 1000);
		while (hasDupes(target))
		  target = (int) (Math.random() * 9000 + 1000);
    String targetStr = target + "";
    return targetStr;
  }

  // Prompts the user for a guess and repeats until valid guess is made.
  public static String getGuess() 
  { 
    Scanner sc = new Scanner(System.in);
    boolean validGuess = false;
    int userGuess = 0;
    while (!validGuess)
    {
      System.out.print("Guess a 4-digit number from 1000 to 9999 with no duplicate digits: ");
      userGuess = sc.nextInt();
      if (!(hasDupes(userGuess) || (userGuess < 1000))) 
        validGuess = true;
    }
    String userStr = userGuess + "";
    return userStr;
  }
}
