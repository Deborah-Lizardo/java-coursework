public class Person {

    String email;
    String cpf;
    String name;
    String birthday;
    Adress adress;

    public Person(String email, String cpf,String name,String birthday, Adress adress){
        this.email = email;
        this.cpf = cpf;
        this.name = name;
        this.birthday = birthday;
        this.adress = adress;
    }

    public void displayInfo() {
        System.out.println("-------- Person Information --------");
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);

        System.out.println("\n-------- Address Information --------");
        System.out.println("Street: " + adress.street);
        System.out.println("Street Number: " + adress.street_number);
        System.out.println("ZIP Code (CEP): " + adress.cep);
    }
}
