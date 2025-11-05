package controller;
import view.MenuView;

public class MenuController {
    private MenuView mv;

    public MenuController() {
        mv = new MenuView();
        int opcao = mv.menu();

        while (opcao != 9) {
            if (opcao == 1) {
                ListarEventoController controller = new ListarEventoController();
                controller.listarEventos();
            } else if (opcao == 2) {
                ListarEventoController controller = new ListarEventoController();
                controller.listarEventosQuarta();
            } else {
                mv.opcaoIncorreta();
            }
            opcao = mv.menu();
        }
    }
}