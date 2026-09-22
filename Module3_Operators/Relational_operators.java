package core_java_fundamentals.Module3_Operators;

public class Relational_operators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Greater than
        boolean isGreater = num1 > num2;
        System.out.println(num1 + " > " + num2 + ": " + isGreater);

        // Less than
        boolean isLess = num1 < num2;
        System.out.println(num1 + " < " + num2 + ": " + isLess);

        // Greater than or equal to
        boolean isGreaterOrEqual = num1 >= num2;
        System.out.println(num1 + " >= " + num2 + ": " + isGreaterOrEqual);

        // Less than or equal to
        boolean isLessOrEqual = num1 <= num2;
        System.out.println(num1 + " <= " + num2 + ": " + isLessOrEqual);

        // Equal to
        boolean isEqual = num1 == num2;
        System.out.println(num1 + " == " + num2 + ": " + isEqual);

        // Not equal to
        boolean isNotEqual = num1 != num2;
        System.out.println(num1 + " != " + num2 + ": " + isNotEqual);
    }
}
