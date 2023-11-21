/*
 * Activity 2.4.1
 */
import java.util.Scanner;

public class MinAndMax
{
  public static void main(String[] args)
  {
    /* Your code here */
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int number1 = sc.nextInt();
    System.out.println("Enter an integer: ");
    int number2 = sc.nextInt();
    
    int sum = number1 + number2;
    System.out.println(sum);
    double average = (number1 + number2) / 2;
    System.out.println(average);
  }
}