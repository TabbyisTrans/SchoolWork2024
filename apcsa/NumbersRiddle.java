/*
    ___        __  _       _ __           ___ ___ _____
   /   | _____/ /_(_)   __(_) /___  __   <  /<  // ___/
  / /| |/ ___/ __/ / | / / / __/ / / /   / / / // __ \ 
 / ___ / /__/ /_/ /| |/ / / /_/ /_/ /   / / / // /_/ / 
/_/  |_\___/\__/_/ |___/_/\__/\__, /   /_(_)_(_)____/  
                             /____/                    
 */

public class NumbersRiddle 
{
  public static void main(String[] args)
  {
    // initializing constants
    int posInt = 5;
    int negInt = -7;
    int zero = 0;
    int one = 1;
    double posDouble = 11.5;
    double negDouble = -20.5;
    
    double number = posInt; // initialized fluid variable
    
    System.out.print("Number you chose: " + number + "\n" ); // prints number you chose
    number *= 2; // doubles number
    System.out.println("your number doubled: " + number); // prints results
    number += 6; // adds six
    System.out.println("your number plus six: " + number); // prints results
    number /= 2; // halves
    System.out.println("your number halved: " + number); // prints results
    number -= posInt; // subracting original number
    System.out.println("your final number is: " + number); // prints final number
    
    System.out.println("-------------------------------"); // prints divider

    number = negInt; // same steps but with negative integer
    System.out.print("Number you chose: " + number + "\n" );
    number *= 2;
    System.out.println("your number doubled: " + number);
    number += 6;
    System.out.println("your number plus six: " + number);
    number /= 2;
    System.out.println("your number halved: " + number);
    number -= negInt;
    System.out.println("your final number is: " + number);

    System.out.println("-------------------------------");

    number = zero; // same steps with zero
    System.out.print("Number you chose: " + number + "\n" );
    number *= 2;
    System.out.println("your number doubled: " + number);
    number += 6;
    System.out.println("your number plus six: " + number);
    number /= 2;
    System.out.println("your number halved: " + number);
    number -= zero;
    System.out.println("your final number is: " + number);

    System.out.println("-------------------------------");

    number = one; // same steps with one
    System.out.print("Number you chose: " + number + "\n" );
    number *= 2;
    System.out.println("your number doubled: " + number);
    number += 6;
    System.out.println("your number plus six: " + number);
    number /= 2;
    System.out.println("your number halved: " + number);
    number -= one;
    System.out.println("your final number is: " + number);

    System.out.println("-------------------------------");

    number = posDouble; // same steps with a positive double
    System.out.print("Number you chose: " + number + "\n" );
    number *= 2;
    System.out.println("your number doubled: " + number);
    number += 6;
    System.out.println("your number plus six: " + number);
    number /= 2;
    System.out.println("your number halved: " + number);
    number -= posDouble;
    System.out.println("your final number is: " + number);

    System.out.println("-------------------------------");

    number = negDouble; // same steps with a negative double
    System.out.print("Number you chose: " + number + "\n" );
    number *= 2;
    System.out.println("your number doubled: " + number);
    number += 6;
    System.out.println("your number plus six: " + number);
    number /= 2;
    System.out.println("your number halved: " + number);
    number -= negDouble;
    System.out.println("your final number is: " + number);
    }
}