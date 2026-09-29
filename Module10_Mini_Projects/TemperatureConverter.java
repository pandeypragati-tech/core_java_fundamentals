import java.util.Scanner;

class TemperatureConverter
{
    static double celsiusToFahrenheit(double celsius)
    {
        return (celsius * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        switch (choice)
        {
            case 1:
                System.out.println(
                    "Fahrenheit = " +
                    celsiusToFahrenheit(temperature)
                );
                break;

            case 2:
                System.out.println(
                    "Celsius = " +
                    fahrenheitToCelsius(temperature)
                );
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
