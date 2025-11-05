package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
    private static MySqlConnection con;

    private Connection connection;

    private  MySqlConnection(){
        String user = "root";
        String passwort = "v6rdpSVkdQBFi8Q5764";
        String StrCon = "jdbc:mysql://127.0.0.1:3306/bd_poo?useSSL=false";
        try {
            this.connection = DriverManager.getConnection(StrCon, user, passwort);
        }
        catch (SQLException ex){

            ex.printStackTrace();
        }
   }

   public static MySqlConnection getMySqlConnection(){
        if (con == null){
            con = new MySqlConnection();
        }
        return con;
   }

   public Connection getConnection(){return this.connection;}
}
