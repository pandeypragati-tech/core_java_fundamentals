import java.util.Scanner;

public class PassArrayToMethod {
    // Method to calculate the sum of an array
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    // Main method to pass an array to the method
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = sumArray(numbers);
        System.out.println("The sum of the array is: " + sum);
        sc.close();
    }

    
}
