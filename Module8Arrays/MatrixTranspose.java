import java.util.Scanner;

public class MatrixTranspose {
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

        // Transpose the matrix
        int[][] transpose = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transpose[j][i] = numbers[i][j];
            }
        }
        
        // Display the transpose of the matrix
        System.out.println("The transpose of the matrix is: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
