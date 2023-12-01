import java.util.Scanner;

public class Anagram
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string one: ");
    String str1 = sc.nextLine();
    System.out.println("Enter string two: ");
    String str2 = sc.nextLine();
    boolean anagram = true;
    String letter = str1.substring(0,1);

    while (str1.length() > 0 && str2.length() >0)
    {
      if (str2.indexOf(letter) >= 0)
      {
        anagram = true;
        if (str2.indexOf(letter) != str2.length() - 1)
        {
        str2 = str2.substring(0, str2.indexOf(letter)) + str2.substring(str2.indexOf(letter + 1));
        }
        if (str2.indexOf(letter) == str2.length())
        {
          str2.substring(0,str2.length()-1);
        }

      }
      else 
      {
        anagram = false;
      } 
      str1.substring(1);
    }

    if (str1.length() == 0 || str2.length() == 0)
    {
      anagram = false;
    }

    System.out.println(anagram);
  }
}
