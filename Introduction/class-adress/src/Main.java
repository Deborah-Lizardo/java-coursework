//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Adress a1 = new Adress("90210", "Beverly Hills", 1234);
        Person p1 = new Person("John Doe", "12/25/1985", "john.doe@example.com", "123-45-6789", a1);
        p1.displayInfo();
    }
}