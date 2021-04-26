package lab9_2;

import lab9_1.MyDate;

public class Manager extends Employee{
    private String department;


    public Manager(String firstname, String lastname, double salary, MyDate birthdate, String department) {
        super(firstname, lastname, salary, birthdate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() + " " +
                "department='" + department + '\'' +
                '}';
    }
}
