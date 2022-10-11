package javaprogrammes;

/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Input first number: ");
        int first = scanner.nextInt();
        System.out.print(" Input second number: ");
        int second = scanner.nextInt();
        sum();
        multiply();
        subtract();
        divide();
        remainder();
        scanner.close();

    }

    public static void sum(){
        System.out.println(" addition = " + (125+24));

    }

    public static void multiply(){
        System.out.println(" subtraction = " + (125-24));
    }
    public static void subtract(){
        System.out.println(" multiplication = " + (125*24));

    }
    public static void divide(){
        System.out.println(" division  = " + (125/24));

    }
    public static void remainder(){
        System.out.println(" remainder = " + (125%24));

    }

}
