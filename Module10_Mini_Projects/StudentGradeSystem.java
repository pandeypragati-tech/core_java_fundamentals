import java.util.Scanner;

class StudentGradeSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100)
        {
            System.out.println("Invalid marks");
        }
        else
        {
            System.out.println("\nStudent Name = " + name);
            System.out.println("Marks = " + marks);

            if (marks >= 90)
            {
                System.out.println("Grade = A");
            }
            else if (marks >= 75)
            {
                System.out.println("Grade = B");
            }
            else if (marks >= 60)
            {
                System.out.println("Grade = C");
            }
            else if (marks >= 40)
            {
                System.out.println("Grade = D");
            }
            else
            {
                System.out.println("Grade = F");
            }
        }

        sc.close();
    }
}
