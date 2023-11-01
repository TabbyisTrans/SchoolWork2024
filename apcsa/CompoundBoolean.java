/*
 * Activity 1.3.5
 */
import java.util.Scanner;

public class CompoundBoolean
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in); 
    
    System.out.println("Enter the first number");
    int a = Integer.parseInt(sc.nextLine()); 

    System.out.println("Enter the second number");
    int b = Integer.parseInt(sc.nextLine()); 

    System.out.println("Enter the second number");
    int c = Integer.parseInt(sc.nextLine());

    /* your code here */

    if (a > b) 
    {
      System.out.println("A is greater than B");
    }
    else 
    {
      System.out.println("A is less than B");
    }

    if (b > c) 
    {
      System.out.println("B is greater than C");
    }
    else 
    {
      System.out.println("B is less than C");
    }

    if ((a > b) && (b > c)) 
    {
      System.out.println("A is greater than B and B is greater than C");
    }
    else 
    {
      System.out.println("A is less than B and B is less than C");
    }
    
    if ((a > b) || (b > c)) 
    {
      System.out.println("A is greater than B or B is greater than C");
    }
    else 
    {
      System.out.println("A is less than B or B is less than C");
    }

    if (!((a > b) && (b > c))) {
      System.out.println("A is not greater than B and B is not greater than C");
    }
    else 
    {
      System.out.println("A is greater than B and B is greater than C");
    }

    if (!(a < b)) {
      System.out.println("A is greater than B");
    }
    else 
    {
      System.out.println("A is less than B");
    }

    if (!(b < c)) {
      System.out.println("B is greater than C");
    }
    else 
    {
      System.out.println("B is less than C");
    }
  }
}
