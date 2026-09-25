package core_java_fundamentals.Module7_Methods;

import java.util.Scanner;

public class P06_ParameterNoReturn {

    // Method definition with parameters and no return value
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Method invocation with arguments
        printSum(num1, num2);

        sc.close();
    }
    
}
