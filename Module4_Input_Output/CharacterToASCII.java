package core_java_fundamentals.Module4_Input_Output;

import java.util.Scanner;
public class CharacterToASCII {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a character input
        System.out.print("Enter a character: ");
        char userInput = sc.next().charAt(0); // Read the first character of the input

        // Convert the character to its ASCII value
        int asciiValue = (int) userInput;

        // Display the ASCII value of the entered character
        System.out.println("The ASCII value of '" + userInput + "' is: " + asciiValue);

        // Close the scanner
        sc.close();
    }
    
}
