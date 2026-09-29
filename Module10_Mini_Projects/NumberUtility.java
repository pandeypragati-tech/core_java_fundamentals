import java.util.Scanner;

class NumberUtility
{
    static boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    static boolean isPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }

        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    static int factorial(int number)
    {
        int fact = 1;

        for (int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }

        return fact;
    }

    static int reverse(int number)
    {
        int reverse = 0;

        while (number > 0)
        {
            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number = number / 10;
        }

        return reverse;
    }

    static boolean isPalindrome(int number)
    {
        return number == reverse(number);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Number Utility =====");
        System.out.println("1. Even/Odd");
        System.out.println("2. Prime Check");
        System.out.println("3. Factorial");
        System.out.println("4. Reverse");
        System.out.println("5. Palindrome");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        switch (choice)
        {
            case 1:
                if (isEven(number))
                {
                    System.out.println("Even Number");
                }
                else
                {
                    System.out.println("Odd Number");
                }
                break;

            case 2:
                if (isPrime(number))
                {
                    System.out.println("Prime Number");
                }
                else
                {
                    System.out.println("Not a Prime Number");
                }
                break;

            case 3:
                if (number >= 0)
                {
                    System.out.println("Factorial = " + factorial(number));
                }
                else
                {
                    System.out.println("Factorial is not defined for negative numbers");
                }
                break;

            case 4:
                System.out.println("Reverse = " + reverse(number));
                break;

            case 5:
                if (isPalindrome(number))
                {
                    System.out.println("Palindrome Number");
                }
                else
                {
                    System.out.println("Not a Palindrome Number");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}