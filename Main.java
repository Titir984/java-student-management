import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter roll number:");
        int roll = scanner.nextInt();

        System.out.println("Enter marks:");
        double marks = scanner.nextDouble();

        Student student = new Student(name, roll, marks);
        System.out.println("\nStudent Details:");
        student.displayInfo();

        scanner.close();
    }
}
