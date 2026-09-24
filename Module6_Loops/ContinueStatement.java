package core_java_fundamentals.Module6_Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
            if (count == 5) {
                continue; // Skip the rest of the loop when count is 5
            }
            System.out.println("Count is: " + count);
        }
    }
}
