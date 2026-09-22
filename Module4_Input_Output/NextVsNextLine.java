package core_java_fundamentals.Module4_Input_Output;

import java.util.Scanner;
public class NextVsNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using next() to read a single word
        System.out.print("Enter a single word: ");
        String word = sc.next();
        System.out.println("You entered (next): " + word);

        // Clear the buffer before using nextLine()
        sc.nextLine(); // Consume the newline character

        // Using nextLine() to read a full line
        System.out.print("Enter a full line: ");
        String line = sc.nextLine();
        System.out.println("You entered (nextLine): " + line);

        sc.close();
    }
    
}
