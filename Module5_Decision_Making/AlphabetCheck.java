package core_java_fundamentals.Module5_Decision_Making;

import java.util.Scanner;
public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        if (Character.isLetter(character)) {
            System.out.println(character + " is an alphabet.");
        } else {
            System.out.println(character + " is not an alphabet.");
        }

        scanner.close();
    }
    
}
