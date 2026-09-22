package core_java_fundamentals.Module3_Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Simple assignment
        c = a + b;
        System.out.println("c = a + b: " + c);

        // Compound assignment
        c += a; // equivalent to c = c + a
        System.out.println("c += a: " + c);

        c -= b; // equivalent to c = c - b
        System.out.println("c -= b: " + c);

        c *= a; // equivalent to c = c * a
        System.out.println("c *= a: " + c);

        c /= b; // equivalent to c = c / b
        System.out.println("c /= b: " + c);

        c %= a; // equivalent to c = c % a
        System.out.println("c %= a: " + c);
    }
}
