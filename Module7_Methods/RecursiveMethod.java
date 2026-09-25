
import java.util.Scanner;

// What is recursive method?
// Recursive method is a method that calls itself   

public class RecursiveMethod {
    // method definition
    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of the number is: " + factorial(num));
        sc.close();
    }

}
