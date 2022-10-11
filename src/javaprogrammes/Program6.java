package javaprogrammes;

/*  Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r)
 */

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        circle();
    }
    public static void circle() {

    Scanner scanner = new Scanner(System.in);
        System.out.print(" Input radius of circle: ");
    double radius = scanner.nextDouble();
        System.out.println("Area A = PI*r*r = "+(radius*radius*(Math.PI)));
        scanner.close();

    }

}
