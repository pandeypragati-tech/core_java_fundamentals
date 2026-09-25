
import java.util.Scanner;

public class FactorialUsingMethod {
    // Method definition
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    //Main method
    public static void main(String[] args) {
        System.out.println("Enter a number:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact = factorial(num);
        System.out.println("The factorial of " + num + " is: " + fact);

        sc.close();
    }
}
