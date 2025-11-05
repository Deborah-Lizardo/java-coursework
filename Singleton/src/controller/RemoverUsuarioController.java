package controller;
import dao.UsuarioDAO;
import view.RemoverUsuarioView;

public class RemoverUsuarioController {

    private RemoverUsuarioView ruv;
    private UsuarioDAO uDAO;

    public RemoverUsuarioController(){
        this.ruv = new RemoverUsuarioView();
        this.uDAO = new UsuarioDAO();
        int id = ruv.removerUsuario();
        uDAO.removerUsuario(id);

    }
}
