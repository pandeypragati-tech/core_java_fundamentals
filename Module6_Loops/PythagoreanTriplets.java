package core_java_fundamentals.Module6_Loops;

import java.util.Scanner;
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit for generating Pythagorean triplets: ");
        int limit = sc.nextInt();

        System.out.println("Pythagorean triplets up to " + limit + " are:");

        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                int cSquare = a * a + b * b;
                int c = (int) Math.sqrt(cSquare);

                if (c * c == cSquare && c <= limit) {
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                }
            }
        }

        sc.close();
    }
    
}
