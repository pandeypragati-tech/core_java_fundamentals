package core_java_fundamentals.Module4_Input_Output;

import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        System.out.print("Enter student grade: ");
        char grade = sc.next().charAt(0);

        // Display the entered student details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

        // Close the scanner
        sc.close();
    }
    
}
