package core_java_fundamentals.Module3_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num = 5;

        // Unary plus
        int positiveNum = +num;
        System.out.println("Unary plus: " + positiveNum);

        // Unary minus
        int negativeNum = -num;
        System.out.println("Unary minus: " + negativeNum);

        // Increment
        num++;
        System.out.println("Increment: " + num);

        // Decrement
        num--;
        System.out.println("Decrement: " + num);
    }
}