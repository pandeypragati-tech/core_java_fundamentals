import java.util.Scanner;

public class MatrixDiagonalSum {
    
    public static void main(String[] args) {
        System.out.println("Enter the size of the matrix: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] numbers = new int[size][size];

        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i][i];
        }
        // Display the sum of the diagonal elements
        System.out.println("The sum of the diagonal elements is: " + sum);
        sc.close();
    }
}
