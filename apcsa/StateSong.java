public class StateSong
{
  public static void main(String[] args)
  {
    String Chorus = "I love New York \n (This is so exciting!) \n I love New York \n (And there's no place like it.) \n I love New York \n (This is so exciting!) \n I love New York \n (And there's no place like it.)";
    
    String Bridge = new String("There isn't another like it \n no matter where you go. \n And nobody can compare it. \n It's greater than place and show. \n You know... \n \n New York is special, \n You know, New York is different! \n \n 'Cause there's no place else on earth quite like New York!");

    String iLoveNewYork = "I love New York! \n"
    String Song = (Chorus + Bridge + Chorus + iLoveNewYork + Bridge + Chorus);
    String Song += Chorus
    System.out.println(Song);
    


  }
