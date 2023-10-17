public class numriddle {
    public static void solveRiddle(double num) {
        double innum = num;
        System.out.print("Number you chose: " + num + "\n"); // prints number you chose
        num *= 2; // doubles number
        System.out.println("your number doubled: " + num); // prints results
        num += 6; // adds six
        System.out.println("your number plus six: " + num); // prints results
        num /= 2; // halves
        System.out.println("your number halved: " + num); // prints results
        num -= innum; // subtracting original number
        System.out.println("your final number is: " + num); // prints final number
        System.out.println();
    }

    public static void solveRiddle(int num) {
        int innum = num;
        System.out.print("Number you chose: " + num + "\n"); // prints number you chose
        num *= 2; // doubles number
        System.out.println("your number doubled: " + num); // prints results
        num += 6; // adds six
        System.out.println("your number plus six: " + num); // prints results
        num /= 2; // halves
        System.out.println("your number halved: " + num); // prints results
        num -= innum; // subtracting original number
        System.out.println("your final number is: " + num); // prints final number
        System.out.println();
    }
}