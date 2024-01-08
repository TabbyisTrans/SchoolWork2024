/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;

  public void addBook(Book b)
  {
    book = b;
  }

  public String toString() 
  {
    String info = "";
    info = "Book: " + book; 
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