package homework6;
/*
20. Write a Java Program to print as below.
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

import java.util.Arrays;

public class ProgramPrint20 {

    //Main method

    public static void main(String[] args) {
        //Array declaration

        String [] array = new String [12];

        //Array Initialization
        array[0]= "\"+-------------------------+";
        array[1]= "\"|                         |\"";
        array[2]= "\"|     CORNER STORE        |\"";
        array[3]= "\"|                         |\"";
        array[4]= "\"| 2015-03-29   04:38PM    |\"";
        array[5]= "\"|                         |\"";
        array[6]= "\"| Gallons:         10.870 |\"";
        array[7]= "\"| Price/gallons: $  2.089 |\"";
        array[8]= "\"|                         |\"";
        array[9]= "\"| Fuel total:  $ 22.71    |\"";
        array[10]="\"|                         |\"";
        array[11]= "\"+-------------------------+\"";

        //Array element access

        for (int i = 0;i < 12 ; i++) {

            //call all array for print

            System.out.println(array[i]);

        }
        




    }
}
