
public class CheckingAccount extends BankAccount {

    final static double FEE= 0.15;

    public CheckingAccount(String nam, double amt) {
        super(nam, amt);
        setAccountNumber(getAccountNumber() + "-10");

    }

    @Override
    public boolean withdraw(double amt) {
        amt= amt + FEE;

        return super.withdraw(amt);
    }

}
