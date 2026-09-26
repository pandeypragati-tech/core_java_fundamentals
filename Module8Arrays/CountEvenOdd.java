import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Display the count of even and odd numbers
        System.out.println("The count of even numbers is: " + even);
        System.out.println("The count of odd numbers is: " + odd);
        sc.close();
    }   
}

