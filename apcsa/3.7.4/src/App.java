import java.util.ArrayList;

public class App {
    static ArrayList<Integer> arrList = new ArrayList<Integer>();

    public static void main(String[] args) throws Exception {
        arrList.add(1);
        arrList.add(2);
        arrList.add(0);
        arrList.add(3);
        arrList.add(2);
        arrList.add(4);
        arrList.add(2);
        arrList.add(1);
        arrList.add(0);
        arrList.add(2);
        arrList.add(0);
        arrList.add(1);
        arrList.add(3);
        arrList.add(2);

        System.out.println("Frequency: " + freq());
        System.out.println("Lowest: " + low());
        System.out.println("Average: " + avg());
        System.out.println("Contains 0: " + containsZero());
        System.out.println("Swapped ArrayList: " + swap());
        System.out.println("Sum: " + sum());
        System.out.println("Mode: " + mode());
        System.out.println("All Positive: " + allPositive());
        System.out.println("Flipped ArrayList: " + flip());
    }

    public static int freq() {
        int freq = 0;
        for (int a : arrList) {
            if (a == 0) {
                freq++;
            }
        }
        return freq;
    }

    public static int low() {
        int low = arrList.get(0);
        for (int j = 1; j < arrList.size(); j++) {
            if (arrList.get(j) < low) {
                low = arrList.get(j);
            }
        }
        return low;
    }

    public static int avg() {
        int sum = 0;
        for (int a : arrList) {
            sum += a;
        }
        return sum / arrList.size();
    }

    /**
     * Checks if the ArrayList contains the value 0.
     * 
     * @return true if the ArrayList contains the value 0, false otherwise
     */
    public static boolean containsZero() {
        int ind = 0; // index variable
        boolean zero = false; // boolean variable to indicate if 0 is found

        // loop until the end of the ArrayList or until 0 is found
        while (!zero && ind < arrList.size()) {
            if (arrList.get(ind) == 0) {
                zero = true; // set boolean to true if 0 is found
            }
            ind++; // increment index
        }

        return zero; // return boolean value
    }

    /**
     * Swaps the elements of the ArrayList in place.
     * 
     * @return the modified ArrayList
     */
    public static ArrayList<Integer> swap() {
        for (int j = 0; j < arrList.size() / 2; j++) {
            int swap = arrList.get(j);
            arrList.set(j, arrList.get(arrList.size() - j - 1));
            arrList.set(arrList.size() - j - 1, swap);
        }
        return arrList;
    }

    public static int sum() {
        int sum = 0;
        for (int n = 0; n < arrList.size(); n++) {
            sum += arrList.get(n);
        }
        return sum;
    }

    public static int mode() {
        int modeNum = 0;
        int modeInd = 0;
        ArrayList<Integer> numCount = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numCount.add(0);
        }
        for (int i=0; i<arrList.size();i++)
        {
            numCount.set(arrList.get(i),numCount.get(arrList.get(i))+1);
            if (numCount.get(arrList.get(i))>modeNum)
            {
                modeNum = numCount.get(arrList.get(i));
                modeInd = arrList.get(i);
            }
        }
        
        return modeInd;
    }

    /**
     * A method to flip every pair of elements in an ArrayList of Integers.
     *
     * @param  arrList   the ArrayList of Integers to be flipped
     * @return          void
     */
    public static ArrayList<Integer> flip()
    {
        for (int i=0; i < arrList.size();i+=2)
        {
            int store = arrList.get(i);
            arrList.set(i,arrList.get(i+1));
            arrList.set(i+1,store);
        }
        return arrList;
    } 

    public static boolean allPositive() {
        for (int i: arrList) {
            if (i <= 0) {
                return false;
            }
        }
        return true;
    }
}
