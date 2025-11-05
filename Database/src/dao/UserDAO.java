package dao;
import model.User;
import view.RegisterUserView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    private Connection con;
    private PreparedStatement ps;

    public UserDAO(){
        this.con = MySqlConnection.getMySqlConnection().getConnection();
    }

    public void registerUser(User u)  {
        String query = "INSERT INTO user(passwort, name) VALUES (?, ?)";
        try {
            ps = this.con.prepareStatement(query);
            ps.setString(1, u.getPasswort());
            ps.setString(2, u.getName());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
