package controller;
import view.MenuView;

public class MenuController {
    private MenuView mv;

    public MenuController(){
        mv = new MenuView();
        int opcao = mv.menu();

        if (opcao == 1){
            new CadastrarUsuarioController();
        } else if(opcao == 2){
            new ListarUsuarioController();
        } else if (opcao == 3){

        } else if (opcao == 4){

        } else {
            mv.opcaoIncorreta();
        }
    }
}
