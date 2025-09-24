public class Person {
    private String email;
    private String cpf;
    private String name;
    private String birthday;
    private Address address;

    public Person(String email, String cpf, String name, String birthday, Address address){
        this.email = email;
        this.cpf = cpf;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
