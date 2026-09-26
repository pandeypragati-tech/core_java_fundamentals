

import java.util.Scanner;

public class ArrayAverage {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of integers
        System.out.println("Enter the size of the array: ");
        int size =sc. nextInt();
        


        int[] numbers = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Calculate the average of the array
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            double number = numbers[i];
            sum += number;
        }
        double average = sum / numbers.length;
        
        // Display the average
        System.out.println("The average of the array is: " + average);
        
        sc.close();
        }
    }
