public class Main {
    public static void main(String[] args) {
        Restaurant carlosBakery = new Restaurant("Carlos Bakery", "273086-99", "212-675-6000", "Yellow", 120);
        carlosBakery.showObjects();
        carlosBakery.setAmountWorkers(130);
        carlosBakery.showObjects();

        Restaurant magnoliaBakery = new Restaurant("Magnolia Bakery", "87456-32", "212-724-8142", "Pink", 80);
        magnoliaBakery.showObjects();
        magnoliaBakery.setAmountWorkers(90);
        magnoliaBakery.showObjects();

        Restaurant shakeShack = new Restaurant("Shake Shack", "12345-67", "212-889-1000", "White", 200);
        shakeShack.showObjects();
        shakeShack.setAmountWorkers(220);
        shakeShack.showObjects();

        Restaurant spottedPig = new Restaurant("The Spotted Pig", "67890-12", "212-555-1212", "Blue", 150);
        spottedPig.showObjects();
        spottedPig.setAmountWorkers(160);
        spottedPig.showObjects();
    }
}
