package view;

import model.Usuario;

import java.util.Scanner;

public class EditarUsuarioView {

    private Scanner sc;

    public EditarUsuarioView(){this.sc = new Scanner(System.in);}

    public Usuario editarUsuario(){
        System.out.println("** EDITAR USUÁRIO **");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        return new Usuario(nome, email);
    }
}
