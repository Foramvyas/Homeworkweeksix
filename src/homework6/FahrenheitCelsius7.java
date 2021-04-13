package homework6;

/*
(7) Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class FahrenheitCelsius7 {


    //Main method

    public static void main(String[] Strings) {

            Scanner input = new Scanner(System.in);   //import scanner class

            System.out.print("Input a degree in Fahrenheit: ");
            double fahrenheit = input.nextDouble();

            double celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        }


    }

