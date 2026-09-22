package core_java_fundamentals.Module4_Input_Output;

import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a string input
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Display the entered string
        System.out.println("You entered: " + userInput);

        // Close the scanner
        sc.close();
    }

    
}
