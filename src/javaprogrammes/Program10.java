package javaprogrammes;
/*
Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        table();
    }
    public static void table(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = scanner.nextInt();
        System.out.println(n+"x1=" + n*1);
        System.out.println(n+"x2=" + n*2);
        System.out.println(n+"x3=" + n*3);
        System.out.println(n+"x4=" + n*4);
        System.out.println(n+"x5=" + n*5);
        System.out.println(n+"x6=" + n*6);
        System.out.println(n+"x7=" + n*7);
        System.out.println(n+"x8=" + n*8);
        System.out.println(n+"x9=" + n*9);
        System.out.println(n+"x10="+ n*10);
        scanner.close();
    }
}
