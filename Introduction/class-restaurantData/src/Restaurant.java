public class Restaurant {
    private String name;
    private String cnpj;
    private String phone;
    private String color;
    private int amountWorkers;


    public Restaurant(String name, String cnpj, String phone, String color, int amountWorkers) {
        this.name = name;
        this.cnpj = cnpj;
        this.phone = phone;
        this.color = color;
        this.amountWorkers = amountWorkers;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return this.cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getAmountWorkers() {
        return this.amountWorkers;
    }
    public void setAmountWorkers(int amountWorkers) {
        this.amountWorkers = amountWorkers;
    }

    public void showObjects() {
        System.out.println("------ Restaurant Details ------");
        System.out.printf("Name: %s\nCNPJ: %s\nPhone: %s\nColor: %s\nAmount of workers: %d\n",
                getName(), getCnpj(), getPhone(), getColor(), getAmountWorkers());
        System.out.println("-------------------------------");
    }
}
