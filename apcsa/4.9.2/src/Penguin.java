public class Penguin extends Bird {
    public Penguin(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A penguin arrives...");
    }

    public Penguin() {
        super();
    }

    public void fish() {
        System.out.println("The penguin goes fishing...");
    }
}
