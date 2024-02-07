import java.util.Arrays;
/**
 * RandomPermutation
 */
public class RandomPermutation {

    public static void Next()
    {
        int[] p = {1,2,3,4,5,6,7,8,9,10};
        int[] r = new int[10];
        double random = 0.0;
        int randomInt = 0;
        int rVal = 9;

        for (int i = p.length-1; i > 0; i--)
        {
            random = Math.random() * i-1;
            randomInt = (int)random;
            //System.out.println(random);
            r[rVal] = p[(int)random];
            rVal--;
            p[(int)random] = p[i];
            System.out.println("r: " + Arrays.toString(r));
            System.out.println("p: " + Arrays.toString(p));

        }
        r[0] = p[0]; 
        System.out.println("r: " + Arrays.toString(r));
        System.out.println("p: " + Arrays.toString(p));

    }
}
//Select an element in array p from a random location

//Copy its value to the last unused element of array r

//Copy the last value in p to the location in p you just used

//Decrement a counter so that the last element of p will not be
//used more than once

//Repeat the above steps until all values in p have been used.