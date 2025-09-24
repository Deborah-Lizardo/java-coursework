import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Restaurant restaurant = new Restaurant("Le Gourmet Restaurant");
        restaurant.addDish(new Dish("Coq au Vin", 45.50));
        restaurant.addDish(new Dish("Boeuf Bourguignon", 55.00));
        restaurant.addDish(new Dish("Ratatouille", 30.00));
        restaurant.addDish(new Dish("Quiche Lorraine", 40.00));
        restaurant.addDish(new Dish("Soupe à l'oignon", 25.00));

        System.out.print("Enter customer's name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer's phone: ");
        String customerPhone = scanner.nextLine();

        Customer customer = new Customer(customerName, customerPhone);
        Order order = new Order(customer);

        System.out.println("\nDishes available in the restaurant:");
        restaurant.listDishes();

        for (int i = 0; i < 5; i++) {
            System.out.print("\nChoose a dish (enter the name exactly as shown above): ");
            String choice = scanner.nextLine();

            Dish selectedDish = null;
            for (Dish dish : restaurant.dishes) {
                if (dish.getName().equals(choice)) {
                    selectedDish = dish;
                    break;
                }
            }

            if (selectedDish != null) {
                order.addDish(selectedDish);
            } else {
                System.out.println("Invalid option, try again.");
                i--;
            }
        }

        order.displayOrder();
        System.out.println("Total order value: R$ " + order.calculateTotal());
    }
}
