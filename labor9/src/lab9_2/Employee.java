package lab9_2;

import lab9_1.MyDate;

public class Employee {
    private final int ID;
    private String firstname;
    private String lastname;
    private double salary;
    private MyDate birthdate;
    private static int counter;

    public Employee(String firstname, String lastname, double salary, MyDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.birthdate = birthdate;
        counter++;
        this.ID = counter;
    }

    public int getID() {
        return ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthdate() {
        return birthdate;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                '}';
    }
}
