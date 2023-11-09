/* 
 * Activity 1.1.5
 */
public class FivePlanetTravel
{
  public static void main(String[] args)
  {
    // theplanets.org average distance from earth to the planets
    int mercury = 56974146;
    int venus = 25724767;
    int mars = 48678219;
    int jupiter = 390674710;
    int saturn = 792248270;

    // speed of light and our speed
    int lightSpeed =  670616629;
    lightSpeed /= 10;

    /* your code here */
    double mercuryCalc = mercury;
    mercuryCalc /= lightSpeed;
    System.out.println("distance to Mercury:" + mercuryCalc);
    
    double venusCalc = venus;
    venusCalc /= lightSpeed;
    System.out.println("distance to Venus:" + venusCalc);
    
    double marsCalc = mars;
    marsCalc /= lightSpeed;
    System.out.println("distance to Mars:" + marsCalc);
    
    double jupiterCalc = jupiter;
    jupiterCalc /= lightSpeed;
    System.out.println("distance to Jupiter:" + jupiterCalc);
    
    double saturnCalc = saturn;
    saturnCalc /= lightSpeed;
    System.out.println("distance to Saturn:" + saturnCalc);
    
    double total = mercuryCalc + venusCalc + marsCalc + jupiterCalc + saturnCalc;
    int numPlanets = 5;
    int average = (int) (total / numPlanets + .5);
    System.out.println("Average travel time: " + average);
  }
}
