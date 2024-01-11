/*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */
public class Song {
    private String title;
    private int rating;

    /*** Constructor ****/
    public Song(String t)
    {
        title = t;
    }
    public Song(String t, int r) {
        title = t;
        rating = r;
    }

    /*** Accessor methods ***/
    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        String info = title; 
        if (rating != 0) {
            info += ", rating is " + rating;
        }
        return info;
    }

    /*** Mutator methods ***/
    public void setTitle(String t) {
        title = t;
    }

    public void adjustRating(int r) {
        if (rating + r >= 0 && rating + r <= 10) {
            rating += r;
        }
    }

    public boolean equals(Song b) {
        if (this.title.equals(b.title)) {
            return true;
        } else
            return false;
    }
}
