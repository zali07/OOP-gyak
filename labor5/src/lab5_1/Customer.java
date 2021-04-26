package lab5_1;

import java.util.ArrayList;

public class Customer {
    private static int numCustomers = 0;
    private final int id;
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();


    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        ++numCustomers;
        this.id = numCustomers;
    }

    public int getId(){
        return id;
    }

    public int getNumAccounts(){
        return numCustomers;
    }

    public ArrayList<String> getAccountNumber(){
        ArrayList<String> accountNumbers = new ArrayList<>();
        for(BankAccount account: accounts){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }

    public void addAccount(BankAccount account) {
        if(account == null){
            return;
        }

        accounts.set(numCustomers, account);
        numCustomers++;
    }

    public BankAccount getAccount(String accountNumber) {
        for(BankAccount account:accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                accounts.remove(account);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + accounts +
                '}';
    }
}
