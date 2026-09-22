package core_java_fundamentals.Module4_Input_Output;

import java.util.Scanner;
public class MultipleInputs {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user for multiple inputs
        System.out.print("Enter an integer: ");
        int intInput = sc.nextInt();

        System.out.print("Enter a double value: ");
        double doubleInput = sc.nextDouble();

        System.out.print("Enter a character: ");
        char charInput = sc.next().charAt(0);

        System.out.print("Enter a string: ");
        String stringInput = sc.next();

        // Display the entered values
        System.out.println("You entered:");
        System.out.println("Integer: " + intInput);
        System.out.println("Double: " + doubleInput);
        System.out.println("Character: " + charInput);
        System.out.println("String: " + stringInput);

        // Close the scanner
        sc.close();
    }
    
}
