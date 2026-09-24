package core_java_fundamentals.Module6_Loops;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int terms = sc.nextInt();
        
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second; // Calculate the next term
            first = second; // Update first to second
            second = next; // Update second to next
        }
        
        sc.close();
    }
    
}
