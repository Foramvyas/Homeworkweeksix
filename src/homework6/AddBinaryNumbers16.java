package homework6;
/*
(16) Write a Java program to add two binary numbers.

Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101

 */

public class AddBinaryNumbers16 {

    //Main method
    public static void main(String[] args) {
        int a= 10;
        int b=11;

        Integer integer = Integer.parseInt(String.valueOf(a),2);   // method to convert in to binary number
        Integer integer1 = Integer.parseInt(String.valueOf(b),2);
        Integer output= integer+integer1;
        System.out.println(Integer.toBinaryString(output));
    }



}
