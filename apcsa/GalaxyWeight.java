/* 
 * Activity 1.1.3
 */
public class GalaxyWeight
{
  public static void main(String[] args)
  {
  final double MASS = 150;
  double mercuryWeight = 3.59;
  double venusWeight = 8.87;
  double earthWeight = 9.81;
  double marsWeight = 3.711;
  double mercuryTotal = mercuryWeight * MASS / earthWeight;
  double venusTotal = venusWeight * MASS /earthWeight;
  double marsTotal = marsWeight * MASS /earthWeight;
  
  System.out.print("your weight on Mercury is: ");
  System.out.println(MASS * mercuryWeight / earthWeight);
  
  System.out.print("your weight on Venus is: ");
  System.out.println(MASS * venusWeight / earthWeight);
  
  System.out.print("your weight on Mars is: ");
  System.out.println(MASS * marsWeight / earthWeight);
  
  System.out.print("your average weight is: ");
  System.out.print(mercuryTotal /3 + venusTotal /3 + marsTotal /3);
  }
}
