package view;
import java.util.Scanner;

public class MenuView {
    private Scanner sc;

    public MenuView(){
        sc = new Scanner(System.in);
    }

    public int menu(){
        System.out.println("*** GERENCIAMENTO ATIVIDADES POLIWEEK ***");
        System.out.println("(1) Cadastrar Atividades POLIWEEK");
        System.out.println("(2) Listar Atividades POLIWEEK");
        System.out.println("(3) Deletar Atividades POLIWEEK");
        System.out.println("(4) Atualizar Atividades POLIWEEK");
        System.out.println("Opção: ");
        return this.sc.nextInt();
    }

    public void opcaoIncorreta(){
        System.out.println("Opção incorreta!");
    }
}