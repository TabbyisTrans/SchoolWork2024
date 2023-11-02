
/*
 * Activity 1.3.6
 */
import java.util.Scanner;

public class DeMorgansLaw {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 'true' or 'false' for A");
    boolean a = Boolean.parseBoolean(sc.nextLine());

    System.out.println("Enter 'true' or 'false' for B");
    boolean b = Boolean.parseBoolean(sc.nextLine());

    /* your code here */

    // Step 5
    if (!(a && b)) // not (a and b)
    {
      System.out.println("NOT (a AND b) evaluates to true");
    } else {
      System.out.println("NOT (a AND b) evaluates to false");
    }
    if (!a || !b) // (not a) or (not b)
    {
      System.out.println("NOT a OR NOT b evaluates to true");
    } else {
      System.out.println("NOT a OR NOT b evaluates to false");
    }

    System.out.println("-------------------------------------");

    // step 6
    if (!(a || b)) // not (a or b)
    {
      System.out.println("NOT (a OR b) evaluates to true");
    } else {
      System.out.println("NOT (a OR b) evaluates to false");
    }
    if (!a && !b) // (not a) and (not b)
    {
      System.out.println("NOT a OR NOT b evaluates to true");
    } else {
      System.out.println("NOT a OR NOT b evaluates to false");
    }
  }
}
