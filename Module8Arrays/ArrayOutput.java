import java.util.Scanner;

public class ArrayOutput {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the elements of the array: ");

        int[] numbers = new int[size];

        for(int i=0; i<size; i++)
        {
            numbers[i] = sc.nextInt();
        }

        sc.close();
        System.out.println("Array output successfully");    
        for(int i=0; i<size; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }
}
