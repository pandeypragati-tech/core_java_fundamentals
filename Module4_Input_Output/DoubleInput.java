package core_java_fundamentals.Module4_Input_Output;

import java.util.Scanner;
public class DoubleInput {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a double input
        System.out.print("Enter a double value: ");
        double userInput = sc.nextDouble();

        // Display the entered double value
        System.out.println("You entered: " + userInput);

        // Close the scanner
        sc.close();
    }
    
}
