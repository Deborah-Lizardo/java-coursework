//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("90210", "Beverly Hills", 1234);
        Person p1 = new Person("John Doe", "12/25/1985", "john.doe@example.com", "123-45-6789", a1);
        Karte k1 = new Karte(123456789, 123, "12/25");
        Account b1 = new Account(987654321, k1, "Agência 1234", p1);

        b1.showAccountInfo();
    }
}