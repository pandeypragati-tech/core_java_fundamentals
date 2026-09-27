import java.util.Scanner;

public class StringSubstring {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Substring of your name: " + name.substring(4));
        System.out.println("Substring of your name: " + name.substring(0, 4));
        sc.close();
    }
}
