package javaprogrammes;

// Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        triangle();
    }
    public static void triangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the Triangle: ");
        float width = scanner.nextFloat();
        System.out.print("Enter the height of the Triangle: ");
        float height = scanner.nextFloat();
        float area = (width*height)/2;
        System.out.println("Area of a triangle is " + area);
        scanner.close();
    }

}
