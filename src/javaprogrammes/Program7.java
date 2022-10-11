package javaprogrammes;

/* Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C)

 */

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        celsius();

    }
    public static void celsius(){
        Scanner convertor = new Scanner(System.in);
        System.out.print(" Please insert temperature value in degree Fahrenheit =  " );
        double temperature = convertor.nextDouble();
        System.out.println( "Celsius = "+ "((F − 32) × 5/9) = " + ((temperature-32) * 5/9)+"°C");
        convertor.close();

    }

}
