package javaprogrammes;
/* Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods (Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Number first =  ");
        int first = scanner.nextInt();
        System.out.print(" Number second = ");
        int second = scanner.nextInt();
        System.out.println(" Calculation for " +first+" and "+second);
        Program5 program5 = new Program5();
        program5.addition(first, second);
        program5.subtraction(first, second);
        multiplication(first, second);
        division(first, second);
        scanner.close();
    }

    public void addition(int a, int b) {

        System.out.println(" addition " + (a + b));

    }

    public void subtraction(int c, int d) {

        System.out.println(" subtraction " + (c - d));
    }

    public static void multiplication(int e, int f) {

        System.out.println(" multiplication " + (e * f));
    }

    public static void division(int g, int h) {

        System.out.println(" division " + (g / h));
    }
}
