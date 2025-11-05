package controller;
import dao.UserDAO;
import model.User;
import view.RegisterUserView;


public class RegisterUserController {
    private RegisterUserView ruv;

    public RegisterUserController() {
        ruv  = new RegisterUserView();
        User u = ruv.RegisterUser();
        UserDAO userDAO = new UserDAO();
        userDAO.registerUser(u);

    }

}
