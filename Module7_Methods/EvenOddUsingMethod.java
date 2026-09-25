
public class EvenOddUsingMethod {
    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
    public static void main(String[] args) {
        int num = 10;
        isEven(num);
    }   
    
}

