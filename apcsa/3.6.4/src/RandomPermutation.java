import java.util.Arrays;
/**
 * RandomPermutation
 */
public class RandomPermutation {

    public static void Next(int l)
    {
        int[] p = new int[l]; // create array of numbers
        int[] r = new int[l]; // create empty array of results
        double random = 0.0; // initialize random number
        int randomInt = 0; // initialize int to store random
        int rVal = l-1; // initialize rVal to store index of last value available in r

        // create numbers to be randomized 
        for (int i=1;i<=p.length;i++)
        {
            p[i-1] = i;
        }
        // loop through p backwards
        for (int i = p.length-1; i > 0; i--)
        {
            random = Math.random() * i-1; // get random number
            randomInt = (int)random; //convert to int
            //System.out.println(random);
            r[rVal] = p[randomInt]; // stores random number
            rVal--; // decrement rVal
            p[(int)random] = p[i]; // swap p[i] with p[randomInt]
            //System.out.println("r: " + Arrays.toString(r));
            //System.out.println("p: " + Arrays.toString(p));

        }
        r[0] = p[0]; // stores last answer
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