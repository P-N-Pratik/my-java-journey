/*
 * Wrapper Classes
 * 
 * int->Integer();
 * char->Character();
 * double->Double();
 * For every primitive Type we are going to have a class for it.
 * And this Classes basically inherits the Object Class
 * 
 */

 public class Wrapper
 {
    public static void main(String[] args) {
        //int num=7;  //Primitive variable
        //Now how do i store this value into the Class type or Object type
        // Integer num1=new Integer(8); // Reference Variable  //The Line simply means The particular syntax is Deplicated that means in future w'll have the better Alternative for it.
        // System.out.println(num1);

        //Insted of this we can directly assign it in this way it wont give a Deplicated Warning.
        // Integer num1=8;
        // System.out.println(num1);



        // int num=7;
        // Integer num1=new Integer(num) //BOXING
        // Now Whats Happening here
        // Here the Priimitive Value is been Stored in the object and this concept of storing the Primitive value in the Object is Known as Boxing.


        
        // int num=7;
        // Integer num1=num;     //AUTOBOXING //As here the num is the primitive type and the num1 is the reference type and it is automatically storing(Converting) the primitive type into the object it is known as AUTOBOXING.
        


        //int num2=num1.intValue(); // UNBOXING //As here we are getting the value for the Object type to the primitive type.

        //int num2=num1; //AUTO-UNBOXING// Since we are automatically getting the value converted from the Object type to Primitive type it is knownn as Auto UNboxing


        String str="12";
        int num3=Integer.parseInt(str);  //For coonverting the String value into the Integer Value.
        System.out.println(num3*2);
    }



 }

 /*
  * 
  */
 