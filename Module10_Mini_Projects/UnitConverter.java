import java.util.Scanner;

class UnitConverter
{
    static double kilometerToMeter(double kilometer)
    {
        return kilometer * 1000;
    }

    static double meterToKilometer(double meter)
    {
        return meter / 1000;
    }

    static double kilogramToGram(double kilogram)
    {
        return kilogram * 1000;
    }

    static double gramToKilogram(double gram)
    {
        return gram / 1000;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Unit Converter =====");
        System.out.println("1. Kilometer to Meter");
        System.out.println("2. Meter to Kilometer");
        System.out.println("3. Kilogram to Gram");
        System.out.println("4. Gram to Kilogram");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch (choice)
        {
            case 1:
                System.out.println(
                    "Result = " + kilometerToMeter(value) + " meters"
                );
                break;

            case 2:
                System.out.println(
                    "Result = " + meterToKilometer(value) + " kilometers"
                );
                break;

            case 3:
                System.out.println(
                    "Result = " + kilogramToGram(value) + " grams"
                );
                break;

            case 4:
                System.out.println(
                    "Result = " + gramToKilogram(value) + " kilograms"
                );
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}