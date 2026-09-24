package core_java_fundamentals.Module6_Loops;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the last digit to reversedNumber
            number /= 10; // Remove the last digit
        }

        System.out.println("The reversed number is: " + reversedNumber);
        
        sc.close();
    }
    
}
