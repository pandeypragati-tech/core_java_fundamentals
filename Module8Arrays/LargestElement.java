import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {

        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        if (largest == numbers[0]) {
            System.out.println("The largest element is: " + largest);
        } else {
            System.out.println("The largest element is: " + largest + " and the second largest element is: " + numbers[0]);
        }
    }
}
