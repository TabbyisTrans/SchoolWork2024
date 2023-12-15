import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();

  static {
    try {
      Scanner input = new Scanner(new File("src/cleanSentiment.csv"));
      while (input.hasNextLine()) {
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0], Double.parseDouble(temp[1]));
        // System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    } catch (Exception e) {
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }

    // read in the positive adjectives in positiveAdjectives.txt
    try {
      Scanner input = new Scanner(new File("src/positiveAdjectives2.txt"));
      while (input.hasNextLine()) {
        posAdjectives.add(input.nextLine().trim());
      }
      input.close();
    } catch (Exception e) {
      System.out.println("Error reading or parsing positiveAdjectives.txt\n" + e);
    }

    // read in the negative adjectives in negativeAdjectives.txt
    try {
      Scanner input = new Scanner(new File("src/negativeAdjectives2.txt"));
      while (input.hasNextLine()) {
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    } catch (Exception e) {
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }
  }

  /**
   * returns a string containing all of the text in fileName (including
   * punctuation),
   * with words separated by a single space
   */
  public static String textToString(String fileName) {
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));

      // add 'words' in the file to the string, separated by a single space
      while (input.hasNext()) {
        temp = temp + input.next() + " ";
      }
      input.close();

    } catch (Exception e) {
      System.out.println("Unable to locate " + fileName);
    }
    // remove any additional space that may have been added at the end of the string
    return temp.trim();
  }

  /**
   * @returns the sentiment value of word as a number between -1 (very negative)
   *          to 1 (very positive sentiment)
   */
  public static double sentimentVal(String word) {
    try {
      return sentiment.get(word.toLowerCase());
    } catch (Exception e) {
      return 0;
    }
  }

  /**
   * Returns the ending punctuation of a string, or the empty string if there is
   * none
   */
  public static String getPunctuation(String word) {
    String punc = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      if (!Character.isLetterOrDigit(word.charAt(i))) {
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }

  /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation(String word) {
    while (word.length() > 0 && !Character.isAlphabetic(word.charAt(0))) {
      word = word.substring(1);
    }
    while (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
      word = word.substring(0, word.length() - 1);
    }

    return word;
  }

  /**
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and
   * returns it.
   */
  public static String randomPositiveAdj() {
    int index = (int) (Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }

  /**
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and
   * returns it.
   */
  public static String randomNegativeAdj() {
    int index = (int) (Math.random() * negAdjectives.size());
    return negAdjectives.get(index);

  }

  /**
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective() {
    boolean positive = Math.random() < .5;
    if (positive) {
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  public static double totalSentiment(String review) {
    double num = 0;
    String word = "";
    int index = 0;

    while (review.length() > 0) {
      review = Review.removePunctuation(review);
      index = review.indexOf(" ");
      if (index != -1) {
        word = review.substring(0, index);
        word = Review.removePunctuation(word);
        review = review.substring(index);
      } else {
        word = review;
        review = "";
      }
      num += Review.sentimentVal(word);
    }

    return num;
  }

  public static String rateReview(String review) {
    double score = Review.totalSentiment(review);
    if (score >= 5) {
      return "*****";
    } else if (score >= 2.5) {
      return "****";
    } else if (score > -2.5 && score < 2.5) {
      return "***";
    } else if (score <= -2.5 && score > -5) {
      return "**";
    } else {
      return "*";
    }
  }

  public static String fakeReview(String fileName) {
    String templateReview = Review.textToString(fileName);
    String fakeReview = "";

    while (templateReview.length() > 0) {
      String word = "";
      int index = templateReview.indexOf(" ");

      if (index != -1) 
      {
        word = templateReview.substring(0, index);
      } 
      else 
      {
        word = templateReview;
      }
      if (word.indexOf("*") != -1) {
        String punctuation = Review.getPunctuation(word);
        String randomAdjective = Review.randomAdjective();
        fakeReview += randomAdjective + punctuation + " ";
      }
      if (word.indexOf("*") == -1) {
        fakeReview += word +" ";
      }
      if (templateReview.indexOf(" ") != -1) {
        templateReview = templateReview.substring(index + 1);
      } else
        templateReview = "";
    }
    return fakeReview;
  }

  public static String fakeReviewStrong(String fileName) {
    String templateReview = Review.textToString(fileName);
    String fakeReview = "";
    String fakeWord = "";
    Double wordVal = 0.0;

    while (templateReview.length() > 0) {
      String word = "";
      int index = templateReview.indexOf(" ");

      if (index != -1) 
      {
        word = templateReview.substring(0, index);
      } 
      else 
      {
        word = templateReview;
      }
      if (word.indexOf("*") != -1) {
        String punctuation = Review.getPunctuation(word);
        word = Review.removePunctuation(word);
        System.out.println(word);
        wordVal = Review.sentimentVal(word);
        System.out.println(wordVal);
        System.out.println(wordVal >= 0);
        if (wordVal >= 0.0)
        {
          while (wordVal >= Review.sentimentVal(fakeWord))
          {
            fakeWord = Review.randomPositiveAdj();
            System.out.println(fakeWord);
          }
        }
      else if (wordVal < 0)
        {
          while (wordVal < Review.sentimentVal(fakeWord))
          {
            fakeWord = Review.randomNegativeAdj();
            System.out.println(fakeWord);
          }
        }
        System.out.println("Final: " + fakeWord);
        fakeReview += fakeWord + punctuation + " ";
        fakeWord = "";
      }
      else {
        fakeReview += word +" ";
      }
      if (templateReview.indexOf(" ") != -1) {
        templateReview = templateReview.substring(index + 1);
      } else
        templateReview = "";
    }
    return fakeReview;
  }


}
