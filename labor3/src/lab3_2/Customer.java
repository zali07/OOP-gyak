package lab3_2;

import lab3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    private int numAccounts;
    public static final int MAX_ACCOUNTS = 10;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber){

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount(String accountNumber) {
        for(BankAccount account:accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void addAccount(BankAccount account) {
        if(account == null){
            return;
        }
        if(numAccounts == MAX_ACCOUNTS){
            System.out.println("Tul sok szamla");
            return;
        }
        accounts[numAccounts]=account;
        numAccounts++;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + accounts +
                '}';
    }
}
