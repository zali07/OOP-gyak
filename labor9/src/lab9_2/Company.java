package lab9_2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee e){

    }

    public void hireAll(String filename){

    }

    public void fire(int id){

    }

    public void printAll(PrintStream ps){

    }

    public void printManagers(PrintStream ps){

    }

    public void sortByComparator(Comparator<Employee> comp){
        Collections.sort(employees, comp);
    }
}
