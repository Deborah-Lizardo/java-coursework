package view;
import java.util.Scanner;

public class MenuView {
    private Scanner sc;

    public MenuView(){
        sc = new Scanner(System.in);
    }
    public int menu() {
        System.out.println("=== User Management Menu ===");
        System.out.println("1. Create User");
        System.out.println("2. Read User");
        System.out.println("3. Update User");
        System.out.println("4. Delete User");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        return this.sc.nextInt();
    }

    public void Incorrectoption(){
        System.out.println("Incorrect option");
    }


    }

