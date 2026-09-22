package core_java_fundamentals.Module4_Input_Output;

import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Display the input received
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
          sc.close();

    }
    }
