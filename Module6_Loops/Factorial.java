package core_java_fundamentals.Module6_Loops;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by the current number
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
        
        sc.close();
    }
    
}
