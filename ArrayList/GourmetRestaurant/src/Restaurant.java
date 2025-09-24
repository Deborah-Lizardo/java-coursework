import java.util.ArrayList;

public class Restaurant {
    String name;
    ArrayList<Dish> dishes;
    ArrayList<Order> orders;

    public Restaurant(String name) {
        this.name = name;
        this.dishes = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void listDishes() {
        System.out.println("Dishes available in the restaurant:");
        for (Dish dish : dishes) {
            dish.displayDetails();
        }
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }
}

