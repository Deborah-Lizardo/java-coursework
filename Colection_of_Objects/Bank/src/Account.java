public class Account {
    int account_number;
    Karte karte;
    String agency;
    Person client;

    public Account (int account_number, Karte karte,String agency,Person client){
        this.account_number = account_number;
        this.karte = karte;
        this.agency = agency;
        this.client = client;
    }

    public void showAccountInfo() {
        System.out.println("-------- Account Information --------");
        System.out.println("Account Number: " + account_number);
        System.out.println("Agency: " + agency);
        System.out.println("Card Number: " + karte.karte_nummer);
        System.out.println("Card Expiry: " + karte.expiration_date);
        System.out.println("Card CVV: " + karte.cvv);

        System.out.println("\n-------- Client Information --------");
        System.out.println("Name: " + client.name);
        System.out.println("Birthday: " + client.birthday);
        System.out.println("Email: " + client.email);
        System.out.println("CPF: " + client.cpf);

    }
}
