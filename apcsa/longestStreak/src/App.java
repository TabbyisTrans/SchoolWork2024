public class App {
    public static void longestStreak(String str)
    {
        int streak = 0;
        String letter = " ";
        int longStreak = 0;
        String longLetter = "";
        for (int i = 1; i < str.length();i++)
        {
            letter = str.substring(i-1, i);
            if (letter.equals(str.substring(i,i+1)))
            {
                streak++;
            }
            else
            {
                if ( streak > longStreak)
                {
                    longStreak = streak;
                    longLetter = letter;
                }
                streak = 1;
            }
        }
        System.out.println(longLetter + " " + longStreak);
    }
    public static void main(String[] args) throws Exception {
        longestStreak("CCAAAAATTT!");
    }
}
