package core_java_fundamentals.Module3_Operators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Operator precedence example
        int result = a + b * c; // Multiplication has higher precedence than addition
        System.out.println("Result of a + b * c: " + result);

        // Using parentheses to change precedence
        result = (a + b) * c; // Parentheses change the order of operations
        System.out.println("Result of (a + b) * c: " + result);
    }
}
