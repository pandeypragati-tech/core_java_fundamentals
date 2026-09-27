import java.util.Scanner;

public class StringIndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Index of P: " + name.indexOf('P'));
        System.out.println("Index of I: " + name.indexOf('i'));
        sc.close();
    
}
}
