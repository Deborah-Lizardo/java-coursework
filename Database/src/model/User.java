package model;

public class User {
    private int idUser;
    private String name;
    private String passwort;

    public User(int idUser, String name, String passwort) {
        this.idUser = idUser;
        this.name = name;
        this.passwort = passwort;
    }

    public User(String name, String passwort) {;
        this.name = name;
        this.passwort = passwort;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
}
