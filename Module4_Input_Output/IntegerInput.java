package core_java_fundamentals.Module4_Input_Output;
import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for an integer input
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt();

        // Display the entered integer
        System.out.println("You entered: " + userInput);

        // Close the scanner
        sc.close();
    }
}
