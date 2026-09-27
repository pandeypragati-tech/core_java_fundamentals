import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        int length = name.length();
        System.out.println("Length of your name: " + length);
        sc.close();
    }
}
