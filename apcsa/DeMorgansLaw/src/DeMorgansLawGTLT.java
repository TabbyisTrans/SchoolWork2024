/*
 * Activity 1.3.6
 */
import java.util.Scanner; 

public class DeMorgansLawGTLT
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number for X");
    int x = Integer.parseInt(sc.nextLine()); 

    System.out.println("Enter a number for Y");
    int y = Integer.parseInt(sc.nextLine()); 
    
    System.out.println("Checking that both x and y are not negative ... ");
    if (!(x < 0) && !(y < 0)) {
      System.out.println("Both x and y are not negative");
    }
    
    /* your code here */ 

    if ( !(x < 0) || !(y < 0)) // can short circuit if 
    {
      System.out.println("Both x and y are not negative");
    }






  }
}
