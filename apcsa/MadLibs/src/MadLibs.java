import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there";
        int index1 = str.indexOf("<");
        int index2 = str.indexOf(">");
        String wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        String input = sc.nextLine();
        String completed = str.substring(0, index1) + input;
        System.out.println(completed);

        int startIndex = index2 + 1;
        index1 = str.indexOf("<",startIndex);
        index2 = str.indexOf(">",startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex,index1) +  input;
        System.out.println(completed);
        
        startIndex = index2 + 1;
        index1 = str.indexOf("<",startIndex);
        index2 = str.indexOf(">",startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex,index1) +  input + str.substring(index2+1);
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
        index1 = str.indexOf("<",startIndex);
        index2 = str.indexOf(">",startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex,index1) +  input;
        System.out.println(completed);
        
        startIndex = index2 + 1;
        index1 = str.indexOf("<",startIndex);
        index2 = str.indexOf(">",startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex,index1) +  input + str.substring(index2+1);
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
        index1 = str.indexOf("<",startIndex);
        index2 = str.indexOf(">",startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex,index1) +  input;
        System.out.println(completed);
        
        startIndex = index2 + 1;
        index1 = str.indexOf("<",startIndex);
        index2 = str.indexOf(">",startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex,index1) +  input + str.substring(index2+1);
        System.out.println(completed);

        startIndex = index2 + 1;
        index1 = str.indexOf("<",startIndex);
        index2 = str.indexOf(">",startIndex);
        wordToReplace = str.substring(index1 + 1, index2);
        System.out.println("Enter a: " + wordToReplace);
        input = sc.nextLine();
        completed = completed + str.substring(startIndex,index1) +  input + str.substring(index2+1);
        System.out.println(completed);
    }
}
