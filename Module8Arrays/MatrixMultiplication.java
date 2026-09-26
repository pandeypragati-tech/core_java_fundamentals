import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        System.out.println("Enter the size of the first matrix: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] numbers1 = new int[size][size];

        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers1[i][j] = sc.nextInt();
            }
        }

        if (numbers1.length == 0) {
            System.out.println("The first matrix cannot be multiplied because it is empty.");
            return;
        }
        
        System.out.println("Enter the size of the second matrix: ");
        int size2 = sc.nextInt();

        int[][] numbers2 = new int[size2][size2];

        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size2; j++) {
                numbers2[i][j] = sc.nextInt();
            }
        }
        sc.close();

        if (numbers2.length == 0) {
            System.out.println("The second matrix cannot be multiplied because it is empty.");
            return;
        }

        // Multiply the matrices
        System.out.println("The product of the matrices is: ");

        for (int i = 0; i < numbers1.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < numbers2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < numbers2.length; k++) {
                    sum += numbers1[i][k] * numbers2[k][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }   
    }   
}
