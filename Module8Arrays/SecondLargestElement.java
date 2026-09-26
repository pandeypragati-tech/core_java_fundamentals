import java.util.Scanner;

public class SecondLargestElement {
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
        int secondLargest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }
    
        if (secondLargest == largest) {
            System.out.println("The second largest element is the same as the largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
        sc.close();
    }   
}
