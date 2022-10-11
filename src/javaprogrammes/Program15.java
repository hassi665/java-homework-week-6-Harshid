package javaprogrammes;
/*
Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        swap();
    }
    public static void swap(){
        String king,cobra,snake;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first name: ");
        king = scanner.nextLine();
        System.out.print("Input second name: ");
        cobra = scanner.nextLine();
        snake=king;
        king=cobra;
        cobra=snake;
        System.out.println("Swapped name: " + king + " --> " + cobra);
        scanner.close();
    }
}
