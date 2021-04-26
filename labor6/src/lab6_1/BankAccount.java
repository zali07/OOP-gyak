package lab6_1;

public class BankAccount {
    private final static String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int counter = 0;
    protected final String accountNumber;
    protected double balance;

    protected BankAccount() {
        ++counter;
        this.accountNumber = createAccountNumber();
    }

    private String createAccountNumber(){
        StringBuffer str = new StringBuffer();
        String counterStr = ""+counter;
        int len = counterStr.length();
        str.append(PREFIX);
        for(int i = 0; i<(ACCOUNT_NUMBER_LENGTH-PREFIX.length()-len); ++i){
//            str.insert(0, '0');
            str.append('0');
        }
//        str.insert(0, PREFIX);
        str.append(counterStr);
        return str.toString();
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            return;
        }
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if(amount <= balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
