
import java.util.Scanner;

public class P04_MethodWithMultipleParameters {


    // Method definition with multiple parameters
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Method invocation with multiple arguments
        int sum = addNumbers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close();
    }
    
}
