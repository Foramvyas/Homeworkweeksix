package homework6;
/*
(5)Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
*/

public class Calculator5 {

    int a=12;//  This is Instance variable
    int b=19;//  This is instance variable

    static float c=23.11f;    //This is static variable
    static int d= 56;        // This is static variable


    //3.2 Declare instance method.

    void addition1 (){
        int k= (a+b);

        // this is calling statement for instance method

        System.out.println("a+b=" +k);
    }
    //3.2 Declare instance method.

    void subtraction1 () {

        // this is calling statement for instance method

       int m=(a-b);
        System.out.println("a-b =" +m);
    }

        //Declare one static method

        static void multiply1 (){
        float n= (c*d);
            System.out.println("c*d=" +n);

        }
        //Declare one static method

     static void divide1(){
       float h= (c/d);
         System.out.println("c/d=" +h);
     }

    public static void main(String[] args) {
        Calculator5 obj =new Calculator5();
        obj.addition1();         //calling instance variable form instance area via object
        obj.subtraction1();      //calling instance variable from instance area via object
        Calculator5.multiply1();  // calling static variable by class name
        Calculator5.divide1();    //calling static variable by class name
    }

    }




