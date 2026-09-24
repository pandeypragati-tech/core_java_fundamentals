package core_java_fundamentals.Module6_Loops;

public class BreakStatement {
    public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
            if (count == 5) {
                break; // Exit the loop when count is 5
            }
            System.out.println("Count is: " + count);
        }
    }
}
