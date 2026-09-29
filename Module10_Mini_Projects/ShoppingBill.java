import java.util.Scanner;

class ShoppingBill
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = price * quantity;
        double discount;

        if (total >= 5000)
        {
            discount = total * 0.20;
        }
        else if (total >= 2000)
        {
            discount = total * 0.10;
        }
        else
        {
            discount = 0;
        }

        double finalAmount = total - discount;

        System.out.println("\n===== Shopping Bill =====");
        System.out.println("Total = ₹" + total);
        System.out.println("Discount = ₹" + discount);
        System.out.println("Final Amount = ₹" + finalAmount);

        sc.close();
    }
}
