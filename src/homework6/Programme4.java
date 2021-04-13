package homework6;

/*Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.

*/

public class Programme4 {

    //4.1 Declare two instance and two static variables.

    // Instance variables
    short s1 = 4432;
    float b = 2.43f;

    //Two static variables
    static char ch = 'H';
    static int x = 7;


    //4.2 Declare one instance method.

    void myData1() {

        //4.4 Call all  instance variables in print statement

        System.out.println(s1);
        System.out.println(b);

    }
    // 4.3 Declare one static method.

   static void myData2() {

        // 4.4 Call all static variables in print statement

        System.out.println(ch);
        System.out.println(x);
    }

    //4.5  Main method

    public static void main(String[] args) {

        //4.6 Call both instance and static methods into the Main method and run the programme.

        Programme4 obj1= new Programme4();
       obj1.myData1();         //call instance method via object
       Programme4.myData2();    //call static method via class name






    }


}