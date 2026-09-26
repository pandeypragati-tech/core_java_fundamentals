
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int unique = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = numbers[numbers.length - 1];
                    numbers[numbers.length - 1] = numbers[i];
                    numbers[i] = numbers[numbers.length - 1];
                    unique++;
                }
            }
            if (unique == numbers.length - 1) {
                break;
            }
        }
    
        // Display the unique elements
        System.out.println("The unique elements are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}
