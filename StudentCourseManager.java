import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public List<String> getCourses() {
        return courses;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class StudentCourseManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // consume newline

            Student student = new Student(name, grade);
            students.add(student);
        }

        // Add courses
        for (Student student : students) {
            System.out.println("\nAdding courses for " + student.getName());
            System.out.print("How many courses to add? ");
            int courseCount = scanner.nextInt();
            scanner.nextLine(); // consume newline

            for (int j = 0; j < courseCount; j++) {
                System.out.print("Enter course " + (j + 1) + ": ");
                String course = scanner.nextLine();
                student.addCourse(course);
            }

            System.out.println(student.getName() + "'s courses: " + student.getCourses());
        }

        // Remove a course from a specific student
        System.out.print("\nEnter student name to remove a course from: ");
        String targetName = scanner.nextLine();

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(targetName)) {
                System.out.print("Enter course to remove: ");
                String courseToRemove = scanner.nextLine();
                student.removeCourse(courseToRemove);
                System.out.println(student.getName() + "'s courses after removal: " + student.getCourses());
                break;
            }
        }

        // Final output
        System.out.println("\nFinal Student Details:");
        for (Student student : students) {
            student.printDetails();
            System.out.println("Courses: " + student.getCourses());
            System.out.println();
        }

        scanner.close();
    }
}

