public class Account {
    private Person account_holder;
    private int account_number;
    private Karte karte;
    private String agency;
    private String opening_date;

    public Account (int account_number, Karte karte,String agency,String opening_date, Person account_holder){
        this.account_number = account_number;
        this.karte = karte;
        this.agency = agency;
        this.opening_date = opening_date;
        this.account_holder = account_holder;
    }

    public void showAccountInfo() {
        System.out.println("-------- Account Information --------");
        System.out.println("Account opening date: " + opening_date);
        System.out.println("Account Number: " + account_number);
        System.out.println("Agency: " + agency);
        System.out.println("Card Number: " + karte.karte_nummer);
        System.out.println("Card Expiry: " + karte.expiration_date);
        System.out.println("Card CVV: " + karte.cvv);

        System.out.println("\n-------- Client Information --------");
        System.out.println("Name: " + account_holder.name);
        System.out.println("Birthday: " + account_holder.birthday);
        System.out.println("Email: " + account_holder.email);
        System.out.println("CPF: " + account_holder.cpf);

    }
}
