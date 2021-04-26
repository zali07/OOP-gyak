package lab5_1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name){
        this.name = name;
    }

    public Customer getCustomer(int customerId){
        for(Customer customer:customers){
            if(customer.getAccountNumber().equals(customerId)){
                return customer;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer){
        if(customer == null){
            return;
        }

        customers.set(customers.size()+1, customer);
    }

    public int numCustomers(){
        return customers.size();
    }

    private void printCustomers( PrintStream ps ){
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ){
            ps.println( customer.getId()+", " + customer.getFirstName() +", "+ customer.getLastName()+", "+customer.getNumAccounts());
        }
    }

    public void printCustomersToStdout(){
        printCustomers( System.out );
    }

    public void printCustomersToFile( String filename ){
        try {
            printCustomers( new PrintStream(filename ));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
