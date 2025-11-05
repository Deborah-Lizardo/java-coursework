package controller;

import dao.UsuarioDAO;
import view.ListarUsuarioView;

public class ListarUsuarioController {

    private ListarUsuarioView luv;
    private UsuarioDAO uDAO;

    //aq só queremos chamar informações que já estão gravadas no banco d dados
    //aq é o oposto de cadastrar, que primeiro vc obtem info e depois manda p bd
    //aq pegamos do bd, e mostramos na tela
    public ListarUsuarioController(){
        this.luv = new ListarUsuarioView();
        this.uDAO = new UsuarioDAO();
        luv.listarUsuario(this.uDAO.listarUsuario()); //função do UsuarioDAO

    }
}
