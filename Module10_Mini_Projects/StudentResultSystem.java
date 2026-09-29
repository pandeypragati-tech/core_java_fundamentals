import java.util.Scanner;

class StudentResultSystem
{
    static int calculateTotal(int[] marks)
    {
        int total = 0;

        for (int mark : marks)
        {
            total = total + mark;
        }

        return total;
    }

    static int findHighest(int[] marks)
    {
        int highest = marks[0];

        for (int mark : marks)
        {
            if (mark > highest)
            {
                highest = mark;
            }
        }

        return highest;
    }

    static int findLowest(int[] marks)
    {
        int lowest = marks[0];

        for (int mark : marks)
        {
            if (mark < lowest)
            {
                lowest = mark;
            }
        }

        return lowest;
    }

    static String calculateGrade(double average)
    {
        if (average >= 90)
        {
            return "A";
        }
        else if (average >= 75)
        {
            return "B";
        }
        else if (average >= 60)
        {
            return "C";
        }
        else if (average >= 40)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = sc.nextInt();

        int[] marks = new int[numberOfSubjects];

        for (int i = 0; i < marks.length; i++)
        {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = calculateTotal(marks);

        double average = (double) total / marks.length;

        int highest = findHighest(marks);
        int lowest = findLowest(marks);

        String grade = calculateGrade(average);

        System.out.println("\n===== Student Result =====");
        System.out.println("Name = " + name);
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);
        System.out.println("Highest Mark = " + highest);
        System.out.println("Lowest Mark = " + lowest);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}