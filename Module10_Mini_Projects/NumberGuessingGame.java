import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("===== Number Guessing Game =====");
        System.out.println("Guess a number between 1 and 100");

        while (guess != number)
        {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess < number)
            {
                System.out.println("Too low!");
            }
            else if (guess > number)
            {
                System.out.println("Too high!");
            }
            else
            {
                System.out.println("Correct!");
                System.out.println("Attempts = " + attempts);
            }
        }

        sc.close();
    }
}