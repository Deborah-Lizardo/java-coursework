public class Account {
    private Person accountHolder;
    private int accountNumber;
    private String agency;
    private String openingDate;
    private double balance;

    public Account(int accountNumber, String agency, String openingDate, Person accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.openingDate = openingDate;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }


    public void showAccountInfo() {
        System.out.println("-------- Account Information --------");
        System.out.println("Account opening date: " + openingDate);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Agency: " + agency);
        System.out.println("\n-------- Client Information --------");
        System.out.println("Name: " + accountHolder.getName());
        System.out.println("Email: " + accountHolder.getEmail());
        System.out.println("CPF: " + accountHolder.getCpf());
        System.out.println("Balance: " + balance);
    }
}
