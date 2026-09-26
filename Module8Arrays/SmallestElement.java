import java.util.Scanner;  


public class SmallestElement {
    public static void main(String[] args) {

        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        // Display the smallest element
        if (smallest == numbers[0]) {
            System.out.println("The smallest element is: " + smallest);
        } else {
            System.out.println("The smallest element is: " + smallest + " and the second smallest element is: " + numbers[0]);
        }
    }   
}
