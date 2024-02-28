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
        int mode = 0;
        int modeInd = 0;
        ArrayList<Integer> numCount = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numCount.add(0);
        }
        for (int i = 0; i < arrList.size(); i++) {
            numCount.set(i, numCount.get(i) + 1);
            if (numCount.get(i) > mode) {
                mode = numCount.get(i);
                modeInd = i;
            }
        }
        return modeInd;
    }
}
