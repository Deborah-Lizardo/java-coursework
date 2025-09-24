import java.util.ArrayList;

public class Bank {
    private String bankName;
    private Person manager;
    private ArrayList<Account> accounts;

    public Bank(String bankName, Person manager){
        this.bankName = bankName;
        this.manager = manager;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void printAccountsInfo(){
        double totalBalance = 0;
        for(Account acc : accounts){
            System.out.println("Holder: " + acc.getHolder().getName() + " - Balance: " + acc.getBalance());
            totalBalance += acc.getBalance();
        }
        System.out.println("Total bank balance: " + totalBalance);
    }
}
