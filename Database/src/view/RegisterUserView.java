package view;
import model.User;
import java.util.Scanner;

public class RegisterUserView {
    private Scanner sc;

    public RegisterUserView() {

        this.sc = new Scanner(System.in);
    }

    public User RegisterUser(){
        System.out.println("--Register user--");
        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("Passwort:");
        String passwort = sc.nextLine();
        return  new User(name, passwort);

    }
}
