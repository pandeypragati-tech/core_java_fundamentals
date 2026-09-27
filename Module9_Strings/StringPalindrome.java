import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--)
        {
            reverse = reverse + name.charAt(i);
        }
     
        
       if (name.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
