package core_java_fundamentals.Module5_Decision_Making;

import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.print("Enter your citizenship (yes/no): ");
            String citizenship = scanner.next();

            if (citizenship.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote due to citizenship.");
            }
        } else {
            System.out.println("You are not eligible to vote due to age.");
        }

        scanner.close();
    }
    
}
