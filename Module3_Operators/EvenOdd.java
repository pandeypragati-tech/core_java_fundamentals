package core_java_fundamentals.Module3_Operators;

public class EvenOdd {
    public static void main(String[] args) {
        int number = 10;

        // Check if the number is even or odd using the ternary operator
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is: " + result);
    }
}
