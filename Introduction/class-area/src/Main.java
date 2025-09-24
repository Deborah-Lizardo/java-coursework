import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double areaResult = 0;

        do {
            System.out.println("****** MENU ******");
            System.out.println("Select the shape to calculate area:");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.println("3. Exit");

            choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.print("Enter the base of the triangle (can be an integer or decimal): ");
                String base = input.nextLine().replace(',', '.');
                System.out.print("Enter the height of the triangle (can be an integer or decimal): ");
                String height = input.nextLine().replace(',', '.');

                Area triangle = new Area(base, height);
                areaResult = triangle.triangleArea();
                if (areaResult != -1) {
                    System.out.println("The area of the triangle is: " + areaResult);
                } else {
                    System.out.println("Invalid input for triangle area.");
                }
            } else if (choice == 2) {
                System.out.print("Enter the side length of the square (can be an integer or decimal): ");
                String side = input.nextLine().replace(',', '.');

                Area square = new Area(side, side);
                areaResult = square.squareArea();
                if (areaResult != -1) {
                    System.out.println("The area of the square is: " + areaResult);
                } else {
                    System.out.println("Invalid input for square area.");
                }
            }
        } while (choice != 3);

        input.close();
    }
}
