/*
 * Activity 2.4.1
 */
import java.util.Scanner;

public class TenOccurences
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer to see how many times 10 occurs");
    int number = sc.nextInt();
    int count = 0;

    /* Your code here */
    if ((number % 10) != 0) {
      number /= 10;
    }
    while (number > 0)
    {
      int piece = number % 100;
      number /= 100;
      if (piece == 10) {
        count++;
      }
    }
    System.out.println(count);
  }
}