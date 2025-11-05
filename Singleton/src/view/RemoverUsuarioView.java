package view;

import model.Usuario;

import java.util.Scanner;

public class RemoverUsuarioView {
    private Scanner sc;
    private Usuario idUsuario;


    public RemoverUsuarioView(){
        this.sc = new Scanner(System.in);
    }

    public int removerUsuario(){
        System.out.println("** REMOVER USUÁRIO **");

        System.out.print("Digite o id do usuário: ");
        int id = sc.nextInt();

        return id;
    }
}
