
import java.util.Scanner;

public class ReturnArrayFromMethod {
            // Method to return an array from the main method
            public static int[] returnArray() {
                // Create an array and return it
                // The array is created in the method itself
                System.out.println("Enter the size of the array: ");    
                
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();

                int[] numbers = new int[size];

                System.out.println("Enter the elements of the array: ");

                for (int i = 0; i < size; i++) {
                    numbers[i] = sc.nextInt();
                }
                return numbers;
            }
            // Main method to call the method and display the returned array
            public static void main(String[] args) {
                int[] numbers = returnArray();
                System.out.println("The returned array is: ");
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print(numbers[i] + " ");
                }
            }

    
}