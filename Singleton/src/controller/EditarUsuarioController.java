package controller;
import dao.UsuarioDAO;
import model.Usuario;
import view.EditarUsuarioView;

public class EditarUsuarioController {
    private EditarUsuarioView euv;

    public EditarUsuarioController(){
        euv = new EditarUsuarioView();
        Usuario u1 = euv.editarUsuario();
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.editarUsuario(u1);
    }

}
