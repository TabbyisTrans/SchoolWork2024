public class Owl extends Bird {
    public Owl(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An owl arrives...");
    }

    public Owl() {
        super();
    }

    public void hunt() {
        System.out.println("The owl hunts...");
    }

}
