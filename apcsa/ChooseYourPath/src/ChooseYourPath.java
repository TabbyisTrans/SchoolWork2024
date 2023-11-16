import java.util.Scanner;

public class ChooseYourPath 
{
    public static Boolean hasKey = false;
    public static String input = null;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        
       
        System.out.println("You enter a dark cave, to your let is a dark tunnel, in front of you is a rope going down, which way do you go?");
        System.out.println("(T)unnel - (R)ope");
        input = sc.nextLine();
        if (input.equals("T"))
        {
            System.out.println("you take your lantern and go to the tunnel");
            System.out.println("the tunnel opens to a wide cavern with a strange smell and something shining at the back wall, with the tunnel continuing to the right, do you go into the cavern, or stay in the tunnel?");
            System.out.println("(C)avern - (T)unnel");
            input = sc.nextLine();
            if (input.equals("C")) 
            {
                System.out.println("A noxial gas has seeped up from the cave, you die!");
            }
            else if (input.equals("T"))
            {
                System.out.println("You safely continue...");

                System.out.println("You find a room with a chest and a door, do you open the chest?");
                System.out.println("(Y)es - (N)o");
                input = sc.nextLine();
                if (input.equals("Y"))
                {
                    System.out.println("The chest is rigged! Arrows shoot out of the wall, you die!");
                }
                else if (input.equals("N"))
                {
                    System.out.println("You find a staircase and end up in a large cavern");
                    end();
                }
            }
        }
        else if (input.equals("R"))
        {
            System.out.println("You rappel down into a pool of water, swim out, and make it to a tunnel");
            System.out.println("You find a key lying on a stone in the center of a cavern, do you take it?");
            System.out.println("(Y)es - (N)o");
            input = sc.nextLine();
            if (input.equals("Y"))
            {
                hasKey = true;
                System.out.println("You take the key, nothing happens");
                end();
            }
            else if (input.equals("N"))
            {
                hasKey = false;
                System.out.println("You leave the key");
                end();
            }

        }
    }

    public static void end()
    {
        System.out.println("You find a steel door with a lock, do you try to open it?");
        System.out.println("(Y)es - (N)o");
        input = sc.nextLine();
        if (input.equals("Y") && hasKey == true)
        {
            System.out.println("There is a ladder leading to the surface, you escape!");
        }
        else 
        {
            if (hasKey == false)
            {
            System.out.println("The door is locked.");
            }
            System.out.println("You see faint light coming from the end of the cave, but you feel a small rumble, a voice calls out your name, do you investigate or run?");
            System.out.println("(I)nvestigate - (R)un");
            input = sc.nextLine();
            if (input.equals("I"))
            {
                System.out.println("The cavern collapses, you die!");
            }
            else if (input.equals("R"))
            {
                System.out.println("You run, and make it to the surface!");
            }
        }
    }
}