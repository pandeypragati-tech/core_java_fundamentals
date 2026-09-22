package core_java_fundamentals.Module4_Input_Output;

import java.util.Scanner;
public class CharacterInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a character input
        System.out.print("Enter a character: ");
        char userInput = sc.next().charAt(0);

        // Display the entered character
        System.out.println("You entered: " + userInput);

        // Close the scanner
        sc.close();
    }
    
}
