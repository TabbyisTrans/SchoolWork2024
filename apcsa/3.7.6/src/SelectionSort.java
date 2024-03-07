
/**
 * Activity 3.7.6
 */
import java.util.ArrayList;

public class SelectionSort {
  public static void main(String[] args) {
    ArrayList<Integer> ratings = new ArrayList<Integer>();
    /*
     * ratings.add(5);
     * ratings.add(4);
     * ratings.add(8);
     * ratings.add(9);
     * ratings.add(2);
     * ratings.add(3);
     * ratings.add(1);
     */
    for (int i = 1; i <= 100; i++) {
      ratings.add((int) (Math.random() * 10));
    }
    int numCompares = 0;
    int dataChange = 0;

    // Iterate through all the values in the list.
    for (int i = 0; i < ratings.size() - 1; i++) {
      System.out.println("Array: " + ratings);

      // Keep track of the index of the smallest number.
      int minIndex = i;

      // Iterate from the next index up to the end of the array
      for (int j = i + 1; j < ratings.size(); j++) {
        // If the current element is smaller than the minimum, we have a new
        // smallest element, so set minIndex to the index of the current element.
        numCompares++;
        if (ratings.get(j) < ratings.get(minIndex)) {
          minIndex = j;
        }
      }

      // Swap current with minimum element if they're different
      numCompares++;
      if (ratings.get(i) != ratings.get(minIndex)) {
        dataChange += 2;
        // Swap current with minimum element
        int temp = ratings.get(i);
        ratings.set(i, ratings.get(minIndex));
        ratings.set(minIndex, temp);
      }
    }

    // Print all the elements of the list
    System.out.println(ratings);
    System.out.println("Number of compares: " + numCompares);
    System.out.println("Number of data changes: " + dataChange);

  }
}
