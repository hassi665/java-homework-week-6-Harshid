package javaprogrammes;
/*

"+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.089 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+------------------------+"
 */

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        fuelReceipt();

    }
    public static void fuelReceipt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gallons: ");
        float gal = scanner.nextFloat();
        System.out.println("Price/gallon: ");
        float price = scanner.nextFloat();
        float total = gal*price;
        float totalroundoff = (float)Math.round(total*100)/100;
        System.out.println(" \"+------------------------+\" ");
        System.out.println(" \"|                        |\" " );
        System.out.println(" \"|      CORNER STORE      |\" " );
        System.out.println(" \"|                        |\" " );
        System.out.println(" \"| 2015-03-29  04:38PM    |\" " );
        System.out.println(" \"|                        |\" " );
        System.out.println(" \"| Gallons:     "+gal+"     |\" " );
        System.out.println(" \"| Price/gallon: $" + ""+price+"   |\" " );
        System.out.println(" \"|                        |\" " );
        System.out.println(" \"| Fuel total:  $"+totalroundoff+"    |\" " );
        System.out.println(" \"|                        |\" " );
        System.out.println(" \"+------------------------+\" " );
        scanner.close();
    }
}
