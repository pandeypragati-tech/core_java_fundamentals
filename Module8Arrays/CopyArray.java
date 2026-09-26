import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int[] copy = new int[size];
        
        for (int i = 0; i < size; i++) {
            copy[i] = numbers[i];
        }
        
        System.out.println("The copied array is: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
      
    sc.close();
}
}