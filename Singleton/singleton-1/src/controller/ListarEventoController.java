// Em controller/ListarEventoController.java
package controller;

import dao.EventoDAO;
import view.ListarEventoView;
import java.sql.ResultSet;

public class ListarEventoController {

    public void listarEventos() {
        EventoDAO eventoDAO = new EventoDAO();
        ListarEventoView view = new ListarEventoView();
        ResultSet lista = eventoDAO.listar();
        view.listarEventos(lista);
    }

    public void listarEventosQuarta() {
        EventoDAO eventoDAO = new EventoDAO();
        ListarEventoView view = new ListarEventoView();
        ResultSet lista = eventoDAO.listarQuarta();
        view.listarEventosQuarta(lista);
    }
}
