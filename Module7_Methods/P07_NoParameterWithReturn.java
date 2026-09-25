package core_java_fundamentals.Module7_Methods;

import java.util.Scanner;
public class P07_NoParameterWithReturn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The square of " + num + " is " + square(num));
    }

    public static int square(int num) {
        return num * num;
    }

    }   
