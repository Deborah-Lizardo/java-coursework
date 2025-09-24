public class Client extends Person{
    private String company;
    private String cnpj;
    private int amountWorkers;

    public Client(Person person_1, String company, String cnpj, int amountWorkers) {
        super(person_1.getName(), person_1.getAge());
        this.company = company;
        this.cnpj = cnpj;
        this.amountWorkers = amountWorkers;
    }

    public String getCompany() {return this.company;}
    public void setNameCompany(String name) {
        this.company = company;
    }

    public String getCnpj(){return this.cnpj;}
    public void setCnpj(String cnpj){this.cnpj = cnpj;}

    public int getAmountWorkers() {return this.amountWorkers;}
    public void setAmountWorkers(int amountWorkers) {
        this.amountWorkers = amountWorkers;
    }

}
