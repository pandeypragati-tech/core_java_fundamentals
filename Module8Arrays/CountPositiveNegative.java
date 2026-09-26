import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int positive = 0;
        int negative = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0) {
                negative++;
            }
        }
    
        if (positive == 0 && negative == 0) {
            System.out.println("The array contains only zeroes.");
        } else {
            System.out.println("The count of positive numbers is: " + positive);
            System.out.println("The count of negative numbers is: " + negative);
        }
        sc.close();
    }
}
