import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String text = sc.nextLine();


        System.out.println("Length = " + text.length());
        System.out.println("Character = " + text.charAt(2));
        System.out.println("Uppercase = " + text.toUpperCase());
        System.out.println("Lowercase = " + text.toLowerCase());
        System.out.println("Contains Java = " + text.contains("Java"));
        System.out.println("Index of P = " + text.indexOf('P'));
        System.out.println("Substring = " + text.substring(5));
        System.out.println("Replace = " + text.replace("Java", "Python"));
    }
} 