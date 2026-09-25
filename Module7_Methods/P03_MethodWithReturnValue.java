package core_java_fundamentals.Module7_Methods;

public class P03_MethodWithReturnValue {
    
    // Method definition with return value
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Main method
    public static void main(String[] args) {
        // Method invocation and storing the return value
        int result1 = multiply(5, 10);
        int result2 = multiply(20, 30);

        System.out.println("The product of 5 and 10 is: " + result1);
        System.out.println("The product of 20 and 30 is: " + result2);
    }
}
