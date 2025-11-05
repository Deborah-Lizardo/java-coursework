package dao;

import model.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EventoDAO {

    private Connection conexao;

    public EventoDAO() {
        this.conexao = ConexaoMySQL.getConexaoMySQL().getConnection();
    }

    public ResultSet listar() {
        String sql = "SELECT * FROM evento ORDER BY dia_semana, inicio";
        ResultSet resultado = null;

        try {
            Statement stmt = conexao.createStatement();
            resultado = stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("!! Erro ao listar eventos: " + e.getMessage());
            e.printStackTrace();
        }
        return resultado;
    }

    public ResultSet listarQuarta() {
        String sql = "SELECT * FROM evento WHERE dia_semana = ? ORDER BY inicio";
        ResultSet resultado = null;

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "Quarta");
            resultado = stmt.executeQuery();
        } catch (SQLException e) {
            System.out.println("!! Erro ao listar eventos de quarta-feira: " + e.getMessage());
            e.printStackTrace();
        }
        return resultado;
    }
}
