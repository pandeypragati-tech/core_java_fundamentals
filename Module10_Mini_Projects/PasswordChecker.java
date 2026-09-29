import java.util.Scanner;

class PasswordChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++)
        {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch))
            {
                hasUppercase = true;
            }

            if (Character.isLowerCase(ch))
            {
                hasLowercase = true;
            }

            if (Character.isDigit(ch))
            {
                hasDigit = true;
            }
        }

        if (password.length() >= 8 &&
            hasUppercase &&
            hasLowercase &&
            hasDigit)
        {
            System.out.println("Strong password");
        }
        else
        {
            System.out.println("Password does not meet the basic requirements");

            if (password.length() < 8)
            {
                System.out.println("- Use at least 8 characters");
            }

            if (!hasUppercase)
            {
                System.out.println("- Add an uppercase letter");
            }

            if (!hasLowercase)
            {
                System.out.println("- Add a lowercase letter");
            }

            if (!hasDigit)
            {
                System.out.println("- Add a digit");
            }
        }

        sc.close();
    }
}