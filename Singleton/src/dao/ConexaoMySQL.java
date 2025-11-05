package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

    private static ConexaoMySQL con;
    private Connection connection;

    private ConexaoMySQL(){
        String usuario = "root";
        String senha = "Ana123";
        String strCon = "jdbc:mysql://127.0.0.1:3306/bd_POO?useSSL=false";
        try {
            this.connection = DriverManager.getConnection(strCon, usuario, senha);
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public static ConexaoMySQL getConexaoMySQL(){
        if(con == null){
            con = new ConexaoMySQL();
        }
        return con;
    }

    public Connection getConnection(){
        return this.connection;
    }

}
//metodo construtor privado
//metodo de verificacao da instancia
//metodo de get cpmnextion p fazer a conexao com my sql
//tres metodos obrigatorios para a o singleton fazer conexao com sql

