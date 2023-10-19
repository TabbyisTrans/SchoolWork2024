import java.util.Scanner;

public class MadLibs {

    public static void Madlibs(String str) {
        Scanner sc = new Scanner(System.in);
        // String str = "Today I went to the <place>, and I saw a <noun>, it was very
        // <adjective>";
        int index1 = str.indexOf("<");
        int index2 = str.indexOf(">");
        String wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        String input = sc.nextLine();
        String completed = str.substring(0, index1) + input;
        index1 = str.indexOf("<", index2 + 1);
        index2 = str.indexOf(">", index2);
    }

    public static void main(String[] args) {
        Madlibs("I went to the animal <noun>, the <plural_noun> and the <number> beasts were there");

    }
}
