public class Operations{
    public static void displayOperation(double num1, double num2) {
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("Operations:");
        System.out.println("Sum:" + sum);
        System.out.println("Subtraction:" + difference);
        System.out.println("Product: " + product);

        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
}



