public class Allowance
{
	public static void main(String[] args)
	{
		final double ALLOWANCE = 8.75;
		int ginaAge = 16;
		boolean ginaIsOldEnough = true;
        int carlAge = 13;
		boolean carlIsOldEnough = true;
        int jenAge = 3;
		boolean jenIsOldEnough = false;
		

		System.out.print("Gina’s age is ");
		System.out.println(ginaAge);
		System.out.print("Eligible for allowance? ");
		System.out.println(ginaIsOldEnough);
		System.out.print("Gina’s weekly allowance is ");
		System.out.println(ALLOWANCE);
		System.out.println("--------------------");
        System.out.print("Carl’s age is ");
		System.out.println(carlAge);
		System.out.print("Eligible for allowance? ");
		System.out.println(carlIsOldEnough);
		System.out.print("Carl’s weekly allowance is ");
		System.out.println(ALLOWANCE);
		System.out.println("--------------------");
        System.out.print("Jen's age is ");
        System.out.println(jenAge);
        System.out.print("Eligible for allowance? ");
        System.out.println(jenIsOldEnough);

    

	}
}
