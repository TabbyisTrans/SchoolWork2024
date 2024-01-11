/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  public static String owner = "PLTW";
  private static int numEntries;

  public void addBook(Book b)
  {
    book = b;
    numEntries += 1;
  }

  public void addMovie(Movie b)
  {
    movie = b;
    numEntries += 1;
  }

  public void addSong(Song b)
  {
    song = b;
    numEntries += 1;
  }

  public String toString() 
  {
    String info = "";
    info += "Book: " + book + "\n"; 
    info += "Movie: " + movie +"\n";
    info += "Song: " + song;
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

  public static String getOwner()
  {
    return owner;
  }

  public static void changeOwner(String o)
  {
    owner = o;
  }

  public static int getNumEntries()
  {
    //test
    //System.out.println("Test: Owner is " + owner);
    return numEntries;
  }
}