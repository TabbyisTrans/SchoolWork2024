import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    boolean exit = false;
    Scanner sc = new Scanner(System.in);
    String action = "";
    String content = "";
    int index = 0;
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("English");        
    myList.add("Math");
    myList.add("Computer Science");

    while (exit != true)
    {
        System.out.println(myList);
        System.out.println("Would you like to: (a)dd, (i)nsert, (r)emove, Re(p)lace, or (q)uit");
        action = sc.nextLine();
        if (action.equals("a"))
        {
            System.out.println("What would you like to add?");
            content = sc.nextLine();
            myList.add(content);
        }
        if (action.equals("i"))
        {
            System.out.println("What would you like to add?");
            content = sc.nextLine();
            System.out.println("Where would you like to add this?");
            index = sc.nextInt();
            while(index < 1 || index > myList.size())
            {
                System.out.println("Where would you like to add this?");
                index = sc.nextInt();
            }
            myList.add(index-1, content);
        }
        if(action.equals("r"))
        {
            System.out.println("What index would you like to remove?");
            index = sc.nextInt();
            while(index < 1 || index > myList.size())
            {
                System.out.println("Where would you like to add this?");
                index = sc.nextInt();
            }
            myList.remove(index-1);
        }
        if (action.equals("p"))
        {
            System.out.println("What index would you liek to replace?");
            index = sc.nextInt();
            while(index < 1 || index > myList.size())
            {
                System.out.println("Where would you like to add this?");
                index = sc.nextInt();
            }
            System.out.println("What would you like to change it to?");
            content = sc.nextLine();
            myList.set(index-1, content);
        }
        if (action.equals("q"))
        {
            exit = true;
        }
        action = " ";
        System.out.println(action);
    }
    }
}
