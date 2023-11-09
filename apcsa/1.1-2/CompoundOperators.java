/*
 * Activity 1.1.4
 */
public class CompoundOperators
{
  public static void main(String[] args)
  {
    int numPeople = 0;  
    double totalYears = 0;

    double years = 11.5;  // I will soon be halfway through my junior year.

    totalYears = totalYears + years;
    numPeople = numPeople + 1;
    System.out.println("I have "+ years + " years in school.");
    System.out.println("Total people: " + numPeople);
    System.out.println(", total years: " + totalYears);

    years = 9.5;  // I will soon be halfway through my freshman year.

    totalYears = totalYears + years;
    numPeople = numPeople + 1;
    System.out.println(" My brother has "+ years + " years in school.");
    System.out.println("Total people: " + numPeople);
    System.out.println(", total years: " + totalYears);
    
    years = 5.5;  // I will soon be halfway through my 5th year.

    totalYears = totalYears + years;
    numPeople = numPeople + 1;
    System.out.println(" My neighbor has "+ years + " years in school.");
    System.out.println("Total people: " + numPeople);
    System.out.println(", total years: " + totalYears);

    years = 10.5;  // I will soon be halfway through my sophomor year.

    totalYears = totalYears + years;
    numPeople = numPeople + 1;
    System.out.println(" My brothers friend has "+ years + " years in school.");
    System.out.println("Total people: " + numPeople);
    System.out.println(", total years: " + totalYears);

    System.out.println("Average years in school: " + totalYears/4);
    System.out.println("Total days in school: " + totalYears*180);
    System.out.println("Average days in school: " + (totalYears*180)/4);
  }
}