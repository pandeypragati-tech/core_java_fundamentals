import java.util.Scanner;

public class PalindromeUsingMethod {
    // palindrone number
    public static int palindrome(int num) {
        int rev = 0;
        while(num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num == palindrome(num)) {
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
        sc.close();
    }
}
