package lab5_1;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
//        BankAccount b1 = new BankAccount();
//        System.out.println(b1);
//        for (int i = 0; i<100; ++i){
//            System.out.println(new BankAccount().toString());
//        }

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Zalan", "Fuzi"));
        customers.get(customers.size()-1).addAccount(new BankAccount());

        customers.add(new Customer("Csongor", "Fuzi"));
        customers.get(customers.size()-1).addAccount(new BankAccount());

        customers.add(new Customer("Gabriella", "Fuzi"));
        customers.get(customers.size()-1).addAccount(new BankAccount());

        for(Customer customer: customers){
            System.out.println(customer);
        }
    }
}
