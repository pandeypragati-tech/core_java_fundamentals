import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter the size of the matrix: ");
        int size = sc.nextInt();

        int[][] numbers = new int[size][size];

        System.out.println("Enter the elements of the matrix: ");
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt(); 

        // Prompt the user to enter the elements of the matrix
        System.out.println("Enter the elements of the matrix: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
    
        // Display the matrix
        System.out.println("The matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
