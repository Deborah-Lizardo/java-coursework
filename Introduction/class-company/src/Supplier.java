public class Supplier extends Person {
    private String supplier_name;
    private String cep;

    public Supplier(String name, String age, String supplier_name, String cep) {
        super(name, age);
        this.supplier_name = supplier_name;
        this.cep = cep;
    }

    public String getSupplier_name(){return this.supplier_name;}
    public String setSupplier_name(String supplier_name){return this.supplier_name = supplier_name;}

    public String getCep(){return this.cep;}
    public String setCep(String cep) {return this.cep = cep;}
}
