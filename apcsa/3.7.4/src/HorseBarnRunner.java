import java.util.ArrayList;

/**
 * HorseBarnRunner
 */
public class HorseBarnRunner {

  public static void main(String[] args) {
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> barnSpaces = barn.getSpaces();

    if (barnSpaces.size() == 0) {
      System.out.println("There are no horses in the barn.");
      return;
    }

    System.out.println("----Horses in the Barn----");
    for (Horse h : barnSpaces) {
      System.out.println(h);
    }

    // 2a
    int sum = 0;
    for (Horse h : barnSpaces) {
      if (h != null) {
        sum += h.getWeight();
      }
    }
    int avg = sum / barnSpaces.size();
    System.out.println("Average Weight: " + avg);

    // 2b
    for (Horse h : barnSpaces) {
      if (h != null) {
        if (h.getWeight() > avg) {
          System.out.println(h.getName() + "  weight: " + h.getWeight());
        }
      }
    }

    Horse heaviest = barnSpaces.get(0);
    Horse lightest = barnSpaces.get(0);
    int heavyWeight = barnSpaces.get(0).getWeight();
    int lightWeight = barnSpaces.get(0).getWeight();

    for (Horse h : barnSpaces) {
      if (h != null) {
        if (h.getWeight() > heavyWeight) {
          heavyWeight = h.getWeight();
          heaviest = h;
        }
        if (h.getWeight() < lightWeight) {
          lightWeight = h.getWeight();
          lightest = h;
        }
      }
    }
    System.out.println("Heaviest: " + heaviest.getName());
    System.out.println("Lightest: " + lightest.getName());

    // 3
    System.out.println(barnSpaces);
    int size = barnSpaces.size();
    for (int i = 0; i < size; i++) {
      if (barnSpaces.get(i) != null) {
        if (barnSpaces.get(i).getName().equals("Duke")) {
          barnSpaces.set(i, new Horse("Princess", 1445));
          System.out.println("replaced duke");
        } else if (barnSpaces.get(i).getName().equals("Silver")) {
          barnSpaces.add(i + 1, new Horse("Chief", 1505));
          size++;
        } else if (barnSpaces.get(i).getName().equals("Buddy")) {
          System.out.println("adding Gypsy and Magic");
          System.out.println("Buddy index" + i);
          barnSpaces.add(i, new Horse("Gypsy", 1335));
          barnSpaces.add(i + 2, new Horse("Magic", 1425));
          size += 2;
          i += 2;
        }
      }
    }
    System.out.println(barnSpaces);
  }
}