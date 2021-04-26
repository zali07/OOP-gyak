package lab6_1;

/**
 * takarekszamla
 */

public class SavingsAccount extends BankAccount {
    private double interestRate; //kamatlab

    public SavingsAccount(double interestRate) {
        //az ososztaly constructora automatikusan hivodik
        this.interestRate = interestRate;
    }

    public void addInterest(){
        this.balance += this.interestRate * this.balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
