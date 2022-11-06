
public class SavingsAccount extends BankAccount {
    private double rate= .025;

    private int savingsNumber= 0;

    private String accountNumber;

    public SavingsAccount(String nam, double bal) {
        super(nam, bal);
        accountNumber= getAccountNumber() + "-" + savingsNumber;

    }

    public SavingsAccount(SavingsAccount sav, double init) {
        super(sav, init);
        savingsNumber= savingsNumber + 1;
        accountNumber= getAccountNumber() + "-" + savingsNumber;

    }

    public void postInterest() {
        // calculates one month's worth of interest on the balance
        setBalance(getBalance() * (rate / 12));
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

}
