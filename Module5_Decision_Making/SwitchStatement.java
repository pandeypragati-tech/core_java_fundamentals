package core_java_fundamentals.Module5_Decision_Making;

import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Day 1: Sunday");
                break;
            case 2:
                System.out.println("Day 2: Monday");
                break;
            case 3:
                System.out.println("Day 3: Tuesday");
                break;
            case 4:
                System.out.println("Day 4: Wednesday");
                break;
            case 5:
                System.out.println("Day 5: Thursday");
                break;
            case 6:
                System.out.println("Day 6: Friday");
                break;
            case 7:
                System.out.println("Day 7: Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
    
}
