package core_java_fundamentals.Module3_Operators;

public class PositiveNegative {
    public static void main(String[] args) {
        int number = -5;

        // Check if the number is positive or negative using the ternary operator
        String result = (number >= 0) ? "Positive" : "Negative";
        System.out.println("The number " + number + " is: " + result);
    }
}
