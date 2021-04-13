package homework6;

/*Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */


public class Programme3 {

   // 3.1 Declare one instance and one static variable.

    float a = 2.1f;                    //instance variable
    static String name = "Foram";     // static variable

    //3.2 Declare one instance method.

    void myMethod1 (){

        System.out.println(a);   //  statement for instance method

    }
    // 3.3 Declare one static method.

   static void myMethod2 (){
        System.out.println(name);    //  statement  for static method

    }
    //3.5 Declare the Main method

    public static void main(String[] args) {

       Programme3 obj = new Programme3();
       obj.myMethod1();           // instance method calling via object
       Programme3.myMethod2();    // static method calling via class name




    }













}
