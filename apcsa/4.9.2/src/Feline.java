/**
 * Feline
 */
public class Feline extends Animal {

    public void roar() {
        System.out.println("ROAR!");
    }

    public Feline(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A feline arrives...");
    }
}