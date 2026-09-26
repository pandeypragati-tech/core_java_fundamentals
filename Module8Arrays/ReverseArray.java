import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int[] reversed = new int[size];
        
        for (int i = 0; i < size; i++) {
            reversed[i] = numbers[size - i - 1];
        }
        
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
      
    sc.close();
    }
}
