public class PWGenRunner
{
    public static void main(String[] args)
    {
        PasswordGenerator PwGen = new PasswordGenerator(4);
        String Password1 = PwGen.PwGen();
        System.out.println(Password1);
        System.out.println(PwGen.pwCount());
    }
}