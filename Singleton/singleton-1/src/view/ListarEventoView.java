package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarEventoView {

    public void listarEventos(ResultSet lista) {
        System.out.println("\n** LISTAR EVENTOS POLIWEEK 2025 **\n");
        try {
            while (lista.next()) {
                System.out.println("------------------------------------");
                System.out.println("ID: " + lista.getInt("id_evento"));
                System.out.println("Título: " + lista.getString("titulo"));
                System.out.println("Descrição: " + lista.getString("descricao"));
                System.out.println("Curso: " + lista.getString("curso"));
                System.out.println("Palestrante: " + lista.getString("palestrante"));
                System.out.println("Dia: " + lista.getString("dia_semana"));
                System.out.println("Horário: " + lista.getString("inicio") + " - " + lista.getString("termino"));
                System.out.println("Turno: " + lista.getString("turno"));
                System.out.println("Local: " + lista.getString("localizacao"));
                System.out.println("Vagas: " + lista.getInt("vagas"));
                System.out.println("Tipo de público: " + lista.getInt("publico"));
                System.out.println("Software/Equipamento: " + lista.getString("software_equipamento"));
                System.out.println("------------------------------------\n");
            }
        } catch (SQLException ex) {
            // Imprime o erro caso aconteça algo
            ex.printStackTrace();
        }
    }

    public void listarEventosQuarta(ResultSet lista) {
        System.out.println("\n** LISTAR EVENTOS POLIWEEK DE QUARTA-FEIRA **\n");
        try {
            while (lista.next()) {
                System.out.println("------------------------------------");
                System.out.println("ID: " + lista.getInt("id_evento"));
                System.out.println("Título: " + lista.getString("titulo"));
                System.out.println("Descrição: " + lista.getString("descricao"));
                System.out.println("Curso: " + lista.getString("curso"));
                System.out.println("Palestrante: " + lista.getString("palestrante"));
                System.out.println("Dia: " + lista.getString("dia_semana"));
                System.out.println("Horário: " + lista.getString("inicio") + " - " + lista.getString("termino"));
                System.out.println("Turno: " + lista.getString("turno"));
                System.out.println("Local: " + lista.getString("localizacao"));
                System.out.println("Vagas: " + lista.getInt("vagas"));
                System.out.println("Tipo de público: " + lista.getInt("publico"));
                System.out.println("Software/Equipamento: " + lista.getString("software_equipamento"));
                System.out.println("------------------------------------\n");
            }
        } catch (SQLException ex) {
            // Imprime o erro caso aconteça algo
            ex.printStackTrace();
        }
    }
}