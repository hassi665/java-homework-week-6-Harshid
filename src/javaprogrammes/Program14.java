package javaprogrammes;
/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Program14 {
   // double area = ;
    //double Perimeter = 2*(Width+Height);
    public static void main(String[] args) {
        rectangle();
    }
    public static void rectangle(){
        Scanner scanner = new Scanner (System.in);
        System.out.print(" Enter the value of Width: " );
        double Width = scanner.nextDouble();
        System.out.print(" Enter the value of Height: ");
        double Height = scanner.nextDouble();
        System.out.println("Area of rectangle: " + (Width*Height));
        System.out.println("Perimeter of rectangle: " + (2*(Width+Height)));
        scanner.close();
    }

}
