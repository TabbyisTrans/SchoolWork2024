import java.util.Arrays;
/*
 * Activity 3.6.4
 */
public class StandardArrayAlgorithms {
  public static void main(String[] args) {
    RandomPermutation.Next(20);
    /* 
    int[] goals = { 1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2 };

    int max = goals[0];
    int min = goals[0];
    int sum = 0;
    int[] goalCounter = new int[10];
    for (int i = 0; i < goals.length; i++) {
      sum += goals[i];
      if (goals[i] > max) {
        max = goals[i];
      }
      if (goals[i] < min) {
        min = goals[i];
      }
      goalCounter[goals[i]]++;

    }
    
     * for (int g: goalCounter)
     * {
     * System.out.println(g);
     * }

     // goals[] must have one mode (it will return the first one) and no null values
    int maxCount = 0;
    for (int i = 0; i < goalCounter.length; i++) {
      if (goalCounter[i] > maxCount) {
        maxCount = i;
        // System.out.println("MAX CHANGED TO " + i);
      }
    }
    System.out.println("All goals: " + sum);
    System.out.println("Average goals: " + sum / (double) goals.length);
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
    System.out.println("Mode: " + maxCount);
    Player[] players = { new Player("Alex", 12), new Player("Aiden", 13),
        new Player("Bobbie", 18), new Player("Blaine", 20),
        new Player("Chris", 15), new Player("Charlie", 15) };
    boolean hasValue = false;
    for (int i = 0; hasValue != true && i < players.length; i++) {
      if (players[i].getAge() >= 18) {
        hasValue = true;
        // System.out.println(hasValue);
      }
    }
    if (hasValue == true) {
      System.out.println("Result found");
    } else {
      System.out.println("No result found");
    }

    boolean allHaveValue = true;
    for (Player g : players) {
      if (g.getAge() >= 21) {
        allHaveValue = false;
      }
    }
    System.out.println("All under 21? " + allHaveValue);
    int olderThan = 0;
    for (Player g : players) {
      if (g.getAge() > 15) {
        olderThan++;
      }
    }
    System.out.println("Players older than 15: " + olderThan);

    for (int i = 1; i <= players.length - 1; i = i + 2) {
      System.out.println(players[i - 1].getName() + " and " + players[i].getName());
    }

    // Moves all characters to the right 1
    String[] arr = {"A","B","C","D","E","F"};

    for (int i = arr.length; i > 1; i--)
    {
      String tmp = arr[i - 2];
      arr[i-2] = arr[i-1];
      arr[i - 1] = tmp;
    }
    System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length/2;i++)
    {
      String tmp = arr[i];
      arr[i] = arr[arr.length - i -1];
      arr[arr.length - i - 1] = tmp;
    }
    System.out.println(Arrays.toString(arr));
    */
  }
}
