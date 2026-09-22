package core_java_fundamentals.Module3_Operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        // Bitwise AND
        int andResult = a & b; // Binary: 0001
        System.out.println("Bitwise AND (5 & 3): " + andResult);

        // Bitwise OR
        int orResult = a | b; // Binary: 0111
        System.out.println("Bitwise OR (5 | 3): " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // Binary: 0110
        System.out.println("Bitwise XOR (5 ^ 3): " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // Binary: 1010 (in two's complement)
        System.out.println("Bitwise NOT (~5): " + notResult);
    }
}
