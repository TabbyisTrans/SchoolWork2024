public class PasswordGenerator
{
    private int length = 0;
    private String prefix = "A";
    private static int count = 0;

    public PasswordGenerator(String P, int L)
    {
        prefix = P;
        length = L;
    }

    public PasswordGenerator(int L)
    {
        length = L;
    }

    public String PwGen()
    {
        double randD = 0.0;
        int randI = 0;
        String PW = prefix + ".";

        for (int x = 0; x < length; x++)
        {
            randD = Math.random() * 10;
            randI = (int) randD;
            PW += randI;
        }
        count++;
        return PW;
    }


    public int pwCount()
    {
        return count;
    }

}