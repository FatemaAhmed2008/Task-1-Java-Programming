

import java.time.LocalDate;
import java.time.Period;

// Not public – just a helper class inside the same file
class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService());
        System.out.println();
    }
}

// This is the only public class and matches the file name
public class EmployeeDetailsWithHireDate {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Roberta Petrus", 50000.0, LocalDate.parse("2021-04-01"));
        Employee employee2 = new Employee("Loyd Blair", 70000.0, LocalDate.parse("2015-04-01"));
        Employee employee3 = new Employee("Magdalena Artemon", 50000.0, LocalDate.parse("2011-01-15"));

        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
        employee3.printEmployeeDetails();
    }
}
