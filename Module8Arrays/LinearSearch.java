import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("The element is present at index: " + i);
                break;
            }
        
            if (i == numbers.length - 1) {
                System.out.println("The element is not present in the array.");
            }
    }

        sc.close(); 
    
        }
    }


