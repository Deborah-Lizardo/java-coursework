package controller;

import view.MenuView;

import java.sql.SQLException;

public class MenuController {

    private MenuView mv;

    public MenuController(){
        mv = new MenuView();
        int option;

        do {
            option = mv.menu();

            switch (option) {
                case 1:
                    new RegisterUserController();

                    System.out.println("Create User selected.");

                    break;
                case 2:
                    System.out.println("Read User selected.");

                    break;
                case 3:
                    System.out.println("Update User selected.");

                    break;
                case 4:
                    System.out.println("Delete User selected.");

                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    mv.Incorrectoption();
            }

        } while (option != 5);

    }
}
