package core_java_fundamentals.Module6_Loops;

import java.util.Scanner;
public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        
        for (int number = start; number <= end; number++)
        {
            int original = number;
            int temp = number;
            int sum = 0;

            while (temp > 0)
            {
                int digit = temp % 10;

                sum = sum + (digit * digit * digit);

                temp = temp / 10;
            }

            if (sum == original)
            {
                System.out.print(number + " ");
            }
        sc.close();
    }


}
}
