/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner {
  public static void main(String[] args) {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    // System.out.println("Library:\n" + myLib);
    System.out.println("Book created " + myBook);
    myLib.addBook(myBook);
    // System.out.println("Library:\n" + myLib);

    int myRating = 5;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    myBook.setTitle("The Hobbit");
    // question 13
    System.out.println("Book: " + myBook);
    System.out.println("Library: " + myLib);
    // question 14
    myBook.adjustRating(-1);
    System.out.println("Book: " + myBook);
    System.out.println("Library: " + myLib);

    System.out.println();
    //question15
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();
    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println("Book: " + newBook);
    System.out.println(myLib2);

    // question 20
    //System.out.println("before test:" + newBook);
    //myLib.testBook(newBook);
    //System.out.println("after test:" + newBook);

    // question 25
    Book newBook2 = new Book("1984", "Orwell");
    System.out.println(newBook2 +" equal: " + newBook + "? " + newBook2.equals(newBook));
    newBook2.setAuthor("George Orwell");
    System.out.println(newBook2 +" equal: " + newBook + "? " + newBook2.equals(newBook));

    // question 30

    Movie myMovie = new Movie("The Hunger Games", 1.5);
    Movie myMovie2 = new Movie("The HUnger Games: Catching Fire", 1.5);
    myLib.addMovie(myMovie);
    System.out.println(myLib);
    System.out.println(myMovie + "equal: " + myMovie2 + "? " + myMovie.equals(myMovie2));
  }
}