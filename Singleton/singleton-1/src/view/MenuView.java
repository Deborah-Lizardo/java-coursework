package view;
import java.util.Scanner;

public class MenuView {
    private Scanner sc;

    public MenuView(){
        sc = new Scanner(System.in);
    }

    public int menu(){
        System.out.println("*** GERENCIAMENTO ATIVIDADES POLIWEEK ***");
        System.out.println("(1) Listar Atividades POLIWEEK");
        System.out.println("(2) Listar Atividades POLIWEEK - QUARTA FEIRA");
        System.out.println("(9) Sair");
        System.out.println("Opção: ");
        return this.sc.nextInt();
    }

    public void opcaoIncorreta(){
        System.out.println("Opção incorreta!");
    }
}