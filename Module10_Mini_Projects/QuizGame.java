import java.util.Scanner;

class QuizGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("===== Java Quiz =====");

        System.out.println("\n1. Which keyword is used to create an object?");
        System.out.println("A. class");
        System.out.println("B. new");
        System.out.println("C. object");
        System.out.println("D. create");

        System.out.print("Your answer: ");
        String answer = sc.next();

        if (answer.equalsIgnoreCase("B"))
        {
            score++;
        }

        System.out.println("\n2. Which method is the entry point of a Java program?");
        System.out.println("A. start()");
        System.out.println("B. run()");
        System.out.println("C. main()");
        System.out.println("D. execute()");

        System.out.print("Your answer: ");
        answer = sc.next();

        if (answer.equalsIgnoreCase("C"))
        {
            score++;
        }

        System.out.println("\n3. Which keyword is used to inherit a class?");
        System.out.println("A. implements");
        System.out.println("B. extends");
        System.out.println("C. inherits");
        System.out.println("D. super");

        System.out.print("Your answer: ");
        answer = sc.next();

        if (answer.equalsIgnoreCase("B"))
        {
            score++;
        }

        System.out.println("\n===== Result =====");
        System.out.println("Score = " + score + "/3");

        sc.close();
    }
}