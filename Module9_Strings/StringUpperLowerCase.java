import java.util.Scanner;

public class StringUpperLowerCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter a String:");

        String text = sc.nextLine();

        String upper = text.toUpperCase();
        String lower = text.toLowerCase();

        System.out.println(upper);
        System.out.println(lower);

        sc.close();
    }
}
