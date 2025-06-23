class Employee {
    String name;
    String jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }
}

public class EmployeeDetailsAndSalaryUpdate {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        Employee emp2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);

        System.out.println("Employee Details:");
        emp1.displayDetails();
        emp2.displayDetails();

        emp1.raiseSalary(8);  // 8% raise
        emp2.raiseSalary(12); // 12% raise

        System.out.println("\nAfter raising salary:");
        System.out.println("8% for 'Franziska Waltraud':");
        emp1.displayDetails();

        System.out.println("\n12% for 'Hubertus Andrea':");
        emp2.displayDetails();
    }
}

