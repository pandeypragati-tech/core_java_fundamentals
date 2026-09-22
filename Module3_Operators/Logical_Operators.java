package core_java_fundamentals.Module3_Operators;

public class Logical_Operators {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        // Logical AND
        boolean andResult = condition1 && condition2;
        System.out.println("Logical AND (true && false): " + andResult);

        // Logical OR
        boolean orResult = condition1 || condition2;
        System.out.println("Logical OR (true || false): " + orResult);

        // Logical NOT
        boolean notResult = !condition1;
        System.out.println("Logical NOT (!true): " + notResult);
    }
}
