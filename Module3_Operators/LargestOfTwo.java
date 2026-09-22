package core_java_fundamentals.Module3_Operators;

public class LargestOfTwo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Using the ternary operator to find the largest of two numbers
        int largest = (num1 > num2) ? num1 : num2;
        System.out.println("The largest number between " + num1 + " and " + num2 + " is: " + largest);
    }
}
