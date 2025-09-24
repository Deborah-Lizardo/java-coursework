public class Employee extends Person{
    private String cpf;

    public Employee(Person person_2,String cpf){
        super(person_2.getName(), person_2.getAge());
        this.cpf = cpf;
    }

    public String getCpf(){return this.cpf;}
    public String setCpf(String cpf){return this.cpf = cpf;}
}
