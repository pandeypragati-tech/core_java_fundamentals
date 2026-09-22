package core_java_fundamentals.Module4_Input_Output;

import java.util.Scanner;
public class WideningConversion {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user for an integer input
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        // Widening conversion from int to double
        double doubleValue = intValue;

        // Display the entered integer and its widened double value
        System.out.println("You entered (int): " + intValue);
        System.out.println("Widened to (double): " + doubleValue);

        // Close the scanner
        sc.close();
    }
    
}
