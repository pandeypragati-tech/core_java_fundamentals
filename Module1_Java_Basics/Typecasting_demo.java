package core_java_fundamentals.Module1_Java_Basics;

public class Typecasting_demo {

     public static void main(String[] args)
    {
        int number = 100;

        double value = number;

        double decimal = 25.75;
        int result = (int) decimal;

        System.out.println("Widening: " + value);
        System.out.println("Narrowing: " + result);
    }
}


