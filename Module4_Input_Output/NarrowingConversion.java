package core_java_fundamentals.Module4_Input_Output;

import java.util.Scanner;
public class NarrowingConversion {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a double input
        System.out.print("Enter a double value: ");
        double userInput = sc.nextDouble();

        // Narrowing conversion from double to int
        int narrowedValue = (int) userInput;

        // Display the entered double value and the narrowed int value
        System.out.println("You entered (double): " + userInput);
        System.out.println("Narrowed value (int): " + narrowedValue);

        // Close the scanner
        sc.close();
    }
    
}
