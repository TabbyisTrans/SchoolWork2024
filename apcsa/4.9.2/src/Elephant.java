public class Elephant extends Animal {

    public Elephant(String food, boolean nocturnal,
            double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An elephant arrives...");
    }

    public Elephant() {
        super();
    }

    public void trumpet() {
        System.out.println("*Trumpet sound*");
    }
}
