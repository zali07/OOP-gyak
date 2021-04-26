package lab6_1;

/**
 * folyoszamla
 */

public class CheckingAccount extends BankAccount {
    private double overdraftLimit; //hitelkeret

    public CheckingAccount(double overdraftLimit) {
        //meghivodik az ososztaly konstruktora
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount); // TO DO
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
