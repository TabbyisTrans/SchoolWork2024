/*
 * Activity 3.6.4
 */
public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
   
    int max = goals[0];
    int min = goals[0];
    int sum = 0;
    int[] goalCounter = new int[10];
    for (int i = 0; i < goals.length; i++)
    {
      sum += goals[i];
      if (goals[i] > max)
      {
        max = goals[i];
      } 
      if (goals[i] < min)
      {
        min = goals[i];
      }
      goalCounter[goals[i]]++; 
      
    }
    /*
    for (int g: goalCounter)
      {
        System.out.println(g);
      } 
    */
    /*
     * goals[] must have one mode (it will return the first one) and no null values
     */
    int maxCount = 0;
    for (int i = 0; i < goalCounter.length; i++)
    {
      if (goalCounter[i] > maxCount)
      {
      maxCount = i;
      //System.out.println("MAX CHANGED TO " + i);
      }
    }
    System.out.println("All goals: " + sum);
    System.out.println("Average goals: " + sum/(double)goals.length);
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
    System.out.println("Mode: " + maxCount);
  }
  
}