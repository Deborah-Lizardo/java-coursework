package dao;
import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection con;
    private PreparedStatement ps;


    public UsuarioDAO(){
        this.con = ConexaoMySQL.getConexaoMySQL().getConnection();
    }


    public void cadastrarUsuario(Usuario u){
        String query = "INSERT INTO usuario(nome, email) VALUES(?, ?)";

        try {
            ps = this.con.prepareStatement(query);
            ps.setString(1, u.getNome());
            ps.setString(2, u.getEmail());
            ps.execute();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ResultSet listarUsuario(){
        String query = "SELECT * FROM usuario";

        try {
            ps = this.con.prepareStatement(query);
            return this.ps.executeQuery();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }

        return null;
    }

    public void editarUsuario(Usuario u1){
        String query = "UPDATE usuario SET nome = ?, email = ? WHERE id =?";

        try {
            ps = this.con.prepareStatement(query);
            ps.setString(1, u1.getNome());
            ps.setString(2, u1.getEmail());
            ps.setInt(3,u1.getIdUsuario());
            ps.executeUpdate();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void removerUsuario(int idUsuario){
        String query = " DELETE from WHERE id_usuario = ?";

        try {
            ps = this.con.prepareStatement(query);
            ps.setInt(1,idUsuario);
            ps.executeUpdate();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
