
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();
    String authorToFind = "L. Frank Baum";
    for (Book g: childrensBooks)
    {
      if (g.getAuthor().equals(authorToFind))
      {
        System.out.println(g.getTitle());
      }
    }

    System.out.println();

    String bookToFind = "Sky Island";
    double minimumRating = 0.0;
    for (Book g: childrensBooks)
    {
      if (g.getTitle().equals(bookToFind))
      {
        minimumRating = g.getRating();
      }
    }
    for (Book g: childrensBooks)
    {
      if (g.getRating() >= minimumRating)
      {
        System.out.println(g);
      }
    }
  }
}