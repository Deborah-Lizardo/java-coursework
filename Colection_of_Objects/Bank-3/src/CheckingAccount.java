public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String agency, String openingDate, Person accountHolder, double initialBalance, double overdraftLimit) {
        super(accountNumber, agency, openingDate, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        // Check if the withdrawal amount is positive and within the available balance plus overdraft limit
        if (amount > 0 && getBalance() + overdraftLimit >= amount) {
            double newBalance = getBalance() - amount;
            // I created a protected setter in Account to update the balance directly
            setBalance(newBalance);
        } else {
            System.out.println("Insufficient funds including overdraft limit.");
        }
    }

    // In the Account class, I added this protected method to allow modifying the balance safely:
    // protected void setBalance(double newBalance) { this.balance = newBalance; }
}

