public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, String agency, String openingDate, Person accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, agency, openingDate, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}
