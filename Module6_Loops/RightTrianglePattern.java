package core_java_fundamentals.Module6_Loops;

import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for the right triangle pattern: ");
        int rows = sc.nextInt();

        System.out.println("Right Triangle Pattern:");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
