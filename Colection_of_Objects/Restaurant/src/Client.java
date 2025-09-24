public class Client {
    private String client_name;
    private String phone;

    public Client(String name, String phone) {
        this.client_name = name;
        this.phone = phone;
    }

    public void displayClientData() {
        System.out.println("Name: " + client_name);
        System.out.println("Phone: " + phone);
    }

    public String getName() {
        return client_name;
    }

    public void setName(String name) {
        this.client_name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
