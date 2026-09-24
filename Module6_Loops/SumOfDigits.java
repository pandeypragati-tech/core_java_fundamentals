package core_java_fundamentals.Module6_Loops;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }

        System.out.println("The sum of digits is: " + sum);
        
        sc.close();
    }
    
}
