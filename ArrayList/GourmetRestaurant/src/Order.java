import java.util.List;
import java.util.ArrayList;

class Order {
    private Customer customer;
    private List<Dish> dishes;

    public Order(Customer customer) {
        this.customer = customer;
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void displayOrder() {
        System.out.println("\nOrder Details for " + customer.getName() + " (" + customer.getPhone() + "):");
        for (Dish dish : dishes) {
            System.out.println(dish);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Dish dish : dishes) {
            total += dish.getPrice();
        }
        return total;
    }
}
