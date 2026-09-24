package core_java_fundamentals.Module6_Loops;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = sc.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = sc.nextInt();

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    
}
        
    
}
    

