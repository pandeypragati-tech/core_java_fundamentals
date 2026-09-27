import java.util.Scanner;

public class StringTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");

        String text = sc.nextLine();

        String result = text.trim();
        
        System.out.println("Original String: " + text);
        System.out.println("Trimmed String: " + result);

        sc.close();
    }
}
