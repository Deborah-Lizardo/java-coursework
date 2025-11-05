package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarUsuarioView {

    //para listar os usuarios, nao precisamos instaciar nada, apenas pegar o que ja ets apronto
    //por ex. em cadastra usuario, precismaos instanciar o SCANNER, p pegar info
    //como nao precisamos, iremos deixar sem metodo construtuor, q por padrao fica vazio
    public void listarUsuario(ResultSet lista){
        System.out.println("** LISTAR USUARIOS **");

        try {
            while (lista.next()){ //"enquanto tiver usuario"
                System.out.println("Nome: " + lista.getString("nome"));
                System.out.println("Senha: " + lista.getString(senha));
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
