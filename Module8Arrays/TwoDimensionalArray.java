import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] numbers = new int[size][size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }   
}
