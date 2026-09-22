package core_java_fundamentals.Module3_Operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int num = 5;

        // Pre-increment
        int preIncrement = ++num;
        System.out.println("Pre-increment: " + preIncrement);

        // Post-increment
        int postIncrement = num++;
        System.out.println("Post-increment: " + postIncrement);
        System.out.println("Value after post-increment: " + num);

        // Pre-decrement
        int preDecrement = --num;
        System.out.println("Pre-decrement: " + preDecrement);

        // Post-decrement
        int postDecrement = num--;
        System.out.println("Post-decrement: " + postDecrement);
        System.out.println("Value after post-decrement: " + num);
    }
}
