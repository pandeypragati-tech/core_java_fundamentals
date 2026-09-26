import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int zero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zero++;
            }
        }
        // Display the count of zeroes
        System.out.println("The count of zeroes is: " + zero);
        sc.close();
    }
}
