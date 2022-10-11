package javaprogrammes;

import javax.naming.BinaryRefAddr;
import java.util.Scanner;
import java.util.function.BinaryOperator;

/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */
public class Program16 {
    public static void main(String[] args) {
        System.out.print("Sum of two binary numbers: " + binary());
    }

    public static String binary(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String first = scanner.nextLine();
        System.out.print("Input second binary number: ");
        String second = scanner.nextLine();
        int number0 = Integer.parseInt(first, 2);
        int number1 = Integer.parseInt(second, 2);
        int sum = number0 + number1;
        scanner.close();
        return Integer.toBinaryString(sum);

    }

}

