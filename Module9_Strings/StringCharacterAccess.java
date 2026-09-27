import java.util.Scanner;

public class StringCharacterAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("First character: " + name.charAt(0));
        System.out.println("Last character: " + name.charAt(name.length() - 1));
        sc.close();
    }       
}
