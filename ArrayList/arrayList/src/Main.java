import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        list.add("Computer Science");
        list.add("Software Engineer");
        list.add("Digital Games");
        list.add("Computer Engineering");
        list.add("Computer Information Systems");

        ArrayList<String> copyList = new ArrayList<>(list);

        int menu;

        do {
            System.out.println("******Menu*****");
            System.out.println("1 - Ordered Pair");
            System.out.println("2 - Unordered");
            System.out.println("9 - Quit");
            System.out.println("Insert option for list:");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    Collections.sort(list);
                    System.out.println("Ordered list: " + list);
                    break;

                case 2:
                    System.out.println("Unordered list: " + copyList);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (menu != 9);

        sc.close();
    }
}
