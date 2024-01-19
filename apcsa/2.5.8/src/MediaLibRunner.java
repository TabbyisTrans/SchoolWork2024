public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println(MediaLib.getOwner() + "'s Library");
    MediaLib.changeOwner("New Owner");
    System.out.println(MediaLib.getOwner() + "'s Library");
    MediaLib.owner = "Another Owner";
    System.out.println(MediaLib.owner + "'s Library");
    System.out.println("Initial number of entries: " + MediaLib.getNumEntries());
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("The Lord Of the RIngs", "Tolkin");
    myLib.addBook(myBook);
    MediaLib myLib2 = new MediaLib();
    Movie myMovie = new Movie("The Hunger Games", 1.5);
    myLib2.addMovie(myMovie);
    System.out.println("Library 1: \n" + myLib + "\n");
    System.out.println("Library 2: \n" + myLib2 + "\n");
    System.out.println("Number of entries after: " + MediaLib.getNumEntries());

    System.out.println( "\n");

    Song mySong = new Song("Goosebumps");
    myLib.addSong(mySong);
    System.out.println(myLib);

  }
}