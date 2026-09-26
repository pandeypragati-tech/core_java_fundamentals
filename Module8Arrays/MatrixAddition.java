import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first matrix: ");
        
        int size = sc.nextInt();


        int[][] numbers1 = new int[size][size];

        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers1[i][j] = sc.nextInt();
            }
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

        if (numbers1.length != numbers2.length || numbers1[0].length != numbers2[0].length) {
            System.out.println("The matrices cannot be added because they have different sizes.");
            return;
    
        }   
        
        // Add the matrices
        System.out.println("The sum of the matrices is: ");

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers1[0].length; j++) {
                System.out.print(numbers1[i][j] + " + " + numbers2[i][j] + " = ");
            }
            System.out.println();
        }
        
        sc.close();
    }   

        
}
