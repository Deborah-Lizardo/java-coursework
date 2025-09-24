import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ArrayList<Dish> dishs= new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    Order order = new Order();
   

    int menu;

        do{
        System.out.println("******Menu*****");
        System.out.println("1 - Insert order");
        System.out.println("2 - Insert client");
        System.out.println("3 - Insert dish");
        System.out.println("4 - Display order:");
        System.out.println("9 - Quit");

        menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Insert name:");
                    String name = sc.nextLine();

                    System.out.println("Insert price:");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Order successfully made!");
                    Dish dish = new Dish();
                    dish.setName(name);
                    dish.setPrice(price);
                    order.addDish(dish);

                    break;

                case 2:
                    System.out.println("Insert name:");
                    String client_name = sc.nextLine();

                    System.out.println("Insert phone:");
                    String phone = sc.nextLine();

                    Client client = new Client(client_name, phone);

                    System.out.println("Client added to the database.");
                    break;

                case 3:
                    System.out.println("Insert the dish name:");
                    String dish_name = sc.nextLine();

                    System.out.println("Dish" + dish_name + "successfully made!");
                    break;

                case 4:
                    order.displayOrder();
                    break;


                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;

             } while (menu != 9);
        sc.close();

    }
}