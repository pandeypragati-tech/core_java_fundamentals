package core_java_fundamentals.Module7_Methods;

public class P02_MethodWithParameters {
    
    // Method definition with parameters
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    // Main method
    public static void main(String[] args) {
        // Method invocation with arguments
        printSum(5, 10);
        printSum(20, 30);
    }
}
