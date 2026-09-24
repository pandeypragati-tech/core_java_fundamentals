package core_java_fundamentals.Module6_Loops;

import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pattern: ");
        int rows = sc.nextInt();

        System.out.println("Number Pattern:");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
