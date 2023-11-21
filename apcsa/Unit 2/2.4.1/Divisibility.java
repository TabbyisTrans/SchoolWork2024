/*
 * Activity 2.4.1
 */
import java.util.Scanner;

public class Divisibility
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the dividend: ");
    int dividend = sc.nextInt(); // new method returns int
    System.out.println("Enter the divisor: ");
    int divisor = sc.nextInt();

    /* your code here */
    while (dividend > 0)
    {
      dividend -= divisor;
    }
    if (dividend == 0)
    {
      System.out.println("divisible");
    }
    if (dividend < 0)
    {
      System.out.println("not divisible");
    }
  }
}