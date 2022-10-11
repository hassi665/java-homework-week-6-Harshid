package javaprogrammes;
/*
Write a Java program to convert a decimal number to binary number.
Input Data:
 Input a Decimal Number : 5
Expected Output
Binary number is: 101
 */

import java.util.Scanner;

public class Program17 {

    public static void main(String[] args) {
        convert();
    }

    public static void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the Decimal number: ");
        int n = scanner.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(n));
        scanner.close();
    }


}

