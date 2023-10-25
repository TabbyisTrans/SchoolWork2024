import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// creates scanner object
        String str = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there";// first madlib
                                                                                                         // to be solved
        int index1 = str.indexOf("<"); // looks for the start of the word to be replaced
        int index2 = str.indexOf(">"); // looks for the end of the word to be replaced
        String wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);// asks the user to input the new word
        String input = sc.nextLine(); // grabs the input
        String completed = str.substring(0, index1) + input; // makes a new string with the start of the word up to the
                                                             // new word, adding the new word
        System.out.println(completed); // shows the sentence so far

        int startIndex = index2 + 1;
        index1 = str.indexOf("<", startIndex);
        index2 = str.indexOf(">", startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex, index1) + input;
        System.out.println(completed);

        startIndex = index2 + 1;
        index1 = str.indexOf("<", startIndex);
        index2 = str.indexOf(">", startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex, index1) + input + str.substring(index2 + 1);
        System.out.println(completed);

        System.out.println();

        str = "Once upon a time in a <adjective> land, a <adverb> <noun> grew";
        index1 = str.indexOf("<");
        index2 = str.indexOf(">");
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = str.substring(0, index1) + input;
        System.out.println(completed);

        startIndex = index2 + 1;
        index1 = str.indexOf("<", startIndex);
        index2 = str.indexOf(">", startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex, index1) + input;
        System.out.println(completed);

        startIndex = index2 + 1;
        index1 = str.indexOf("<", startIndex);
        index2 = str.indexOf(">", startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex, index1) + input + str.substring(index2 + 1);
        System.out.println(completed);

        System.out.println();

        str = "Today I went to the <place>, and I saw a <noun>, it was very <adjective>, I did a lot of <verb>.";
        index1 = str.indexOf("<");
        index2 = str.indexOf(">");
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = str.substring(0, index1) + input;
        System.out.println(completed);

        startIndex = index2 + 1;
        index1 = str.indexOf("<", startIndex);
        index2 = str.indexOf(">", startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex, index1) + input;
        System.out.println(completed);

        startIndex = index2 + 1;
        index1 = str.indexOf("<", startIndex);
        index2 = str.indexOf(">", startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex, index1) + input;
        System.out.println(completed);

        startIndex = index2 + 1;
        index1 = str.indexOf("<", startIndex);
        index2 = str.indexOf(">", startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex, index1) + input + str.substring(index2 + 1);
        System.out.println(completed);
    }
}
