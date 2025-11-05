package dao;

import model.Evento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventoDAO {
    private Connection con;

    public EventoDAO() {
        this.con = MySqlConnection.getMySqlConnection().getConnection();
    }

    public List<Evento> listarEvento() {
        List<Evento> eventos = new ArrayList<>();
        String query = "SELECT * FROM EVENTO";

        try (PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Evento evento = new Evento(
                        rs.getInt("idEvento"),
                        rs.getInt("tipo"),
                        rs.getString("curso"),
                        rs.getString("titulo"),
                        rs.getString("descricao"),
                        rs.getString("diaDaSemana"),
                        rs.getString("inicio"),
                        rs.getString("termino"),
                        rs.getString("turno"),
                        rs.getString("palestrante"),
                        rs.getInt("publico"),
                        rs.getString("localizacao"),
                        rs.getInt("vagas"),
                        rs.getString("softwareEquipamento")
                );
                eventos.add(evento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return eventos;

    }

    public List<Evento> listarEventosQuartaFeira() {
        List<Evento> eventos = new ArrayList<>();
        String query = "SELECT * FROM EVENTO WHERE diaDaSemana = ?";

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, "quarta-feira");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Evento evento = new Evento(
                            rs.getInt("idEvento"),
                            rs.getInt("tipo"),
                            rs.getString("curso"),
                            rs.getString("titulo"),
                            rs.getString("descricao"),
                            rs.getString("diaDaSemana"),
                            rs.getString("inicio"),
                            rs.getString("termino"),
                            rs.getString("turno"),
                            rs.getString("palestrante"),
                            rs.getInt("publico"),
                            rs.getString("localizacao"),
                            rs.getInt("vagas"),
                            rs.getString("softwareEquipamento")
                    );
                    eventos.add(evento);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eventos;
    }

}
