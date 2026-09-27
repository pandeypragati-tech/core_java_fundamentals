
import java.util.Scanner;

public class StringComparison {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your city: ");
        String city = sc.nextLine();
        
        if (name.equals(city))
        {
            System.out.println("Names are equal");
        }
        else
        {
            System.out.println("Names are not equal");
        }
        sc.close();
    }
}
