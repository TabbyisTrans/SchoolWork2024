/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;

  public void addBook(Book b)
  {
    book = b;
  }

  public void addMovie(Movie b)
  {
    movie = b;
  }

  public String toString() 
  {
    String info = "";
    info += "Book: " + book + "\n"; 
    info += "Movie: " + movie;
    return info;
  }

  /**
   * @param Book tester
   */
  void testBook(Book tester)
  {
    tester.setTitle("Animal Farm");
    System.out.println(" in test: " + tester.getTitle());
  }
}