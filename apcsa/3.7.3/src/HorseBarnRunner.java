import java.util.ArrayList;
/*
 * Activity 3.7.3
 */
public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    /* your code here */
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> barnSpaces= barn.getSpaces();
    for (Horse g: barnSpaces)
    {
      System.out.println(g);
    }
    System.out.println();

    int numSpaces = barnSpaces.size();
    /*
    for (int i = 0; i < numSpaces; i++)
    {
      Horse h = barnSpaces.get(i);
      if (h.getName().equals("Lady"))
      {
      System.out.println("Bye bye " +  barnSpaces.remove(i));
      numSpaces--;
      h = barnSpaces.get(i);
      }
      if (h.getName().equals("Patches"))
      {
      System.out.println("Bye bye " + barnSpaces.remove(i));
      numSpaces--;
      }
      System.out.println(barnSpaces.get(i));
    }
    */
    int count = 0;
    while(count < barnSpaces.size())
    {
      Horse h = barnSpaces.get(count);
      if (h.getName().equals("Lady"))
      {
      System.out.println("Bye bye " +  barnSpaces.remove(count));
      numSpaces--;
      h = barnSpaces.get(count);
      }
      if (h.getName().equals("Patches"))
      {
      System.out.println("Bye bye " + barnSpaces.remove(count));
      numSpaces--;
      }
      System.out.println(barnSpaces.get(count));
      count++;
    }
  }
} 