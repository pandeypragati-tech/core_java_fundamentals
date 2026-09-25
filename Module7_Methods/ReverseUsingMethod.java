
import java.util.Scanner;

public class ReverseUsingMethod {
    //method definition
    public static int reverse(int num) {
        int rev = 0;
        while(num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reverse of the number is: " + reverse(num));
        sc.close();
    }

    
}
