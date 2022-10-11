package javaprogrammes;

/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        average();
    }
    public static void average(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int first = scn.nextInt();
        System.out.print("Please enter second number: ");
        int second = scn.nextInt();
        System.out.print("Please enter third number: ");
        int third = scn.nextInt();
        System.out.print("Average of the numbers: " + (first+second+third)/3);
        scn.close();
    }
}
