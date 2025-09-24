//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Persons
    Person person_2 = new Person("Eduardo Lino", "18/08/1990");
    Person person_1 = new Person("Deborah", "14/08/2001");

    //Clients
    Client client_1 = new Client( person_1,"Deborah's Bakery","289091889-00", 555);

    //Employees
    Employee employee_1 = new Employee(person_2, "382938009-00");
    }
}