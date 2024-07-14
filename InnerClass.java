/* 
 * INNER CLASS--A CLASS INSIDE A CLASS.
 * 
 * Here if the class 'B' does not requires any other class or should only be used by the class 'A' then it must be declared inside the Class 'A', that is the class inside the class, so here the Class 'B' becomes the inner class and the Class 'A' becomes the outer Class.
 * AS to call the Show()method we need the Object of the Class A ,to access the instance Variable ,we need the object and therefore in the same way to access the methods of the Class B ,we need to Object of the Outer Class.
 * If the Inner Class is declared as Static then we can Create the Object in the way given below.
 * A.B obj1=new A.B();
 * else if non-static Inner class then the same way referred in the below code.
 * A.B obj1=obj.new B();
 * The Outer Class cant be Static ,its illegal modifier for the Outer Class;Only Public ,abstract ,and final are permitted.
 */

//  class A
//  {
//     int age;

//     public void show()
//     {
//         System.out.println("In show");
//     }

//     class B
//     {
//         public void config()
//         {
//             System.out.println("In COnfig");
//         }
//     }
//  }

//  public class InnerClass
//  {
//     public static void main(String[] args) {
//         A obj=new A();
//         obj.show();


//         //How to call the Method of the Inner Class.
//         A.B obj1=obj.new B();
//         obj1.config();
//     }
//  }


/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */


//  /* ANONYMOUS INNER CLASS */

//  class A
// {
//     public void show()
//     {
//         System.out.println("in A show");
//     }

//     public void config(){                                           // Here the show()method is been Overrided as i want it to be Overrided beecause just to implement it little differently.
//         System.out.println("in A config");                         // so i created the class B which has the show() method with the new implementation
//                                                                     // and by creating the object of the Class B ,I override the Method .
//                                                                     //Now if, i know  this change needs to be made only once
//                                                                     //so rather than implementing it here ,it must be implemented as the Anonymous Inner Class, just by implementing it after creating the object.
//     }
// }

// // class B extends A{
// //     public void show()
// //     {
// //         System.out.println("In B show");
// //     }

// // }

// public class InnerClass
// {
//     public static void main(String[] args) {
//         // B obj=new B();
//         // //A obj=new A();
//         // obj.show();
//         // obj.config();

        
//         A obj=new A()
//         {                                                                      // After implementing this i would comment Class B
//             public void show()
//             {
//                 System.out.println("IN B show");
//             }
//         };
//         obj.show();

//     }
// }

/* 
 * As this Class inside the Class
 * And it does not has any name ,and therfore it is known as Anonymous Inner Class
 */


 /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */

 /*ABSTRACT AND ANONYMOUS INNERCLASS */

abstract class A
 {
    public abstract void show();
    public abstract void config();
   
 }


//  class B extends A
//  {
//     public void show()
//     {
//         System.out.println("In A show");                        //Now if you want to Implement the Abstract class only once then then better comment it and implement it as Anonymous Inner class

//     }

//  }
 

 public class InnerClass
 {
    public static void main(String[] args) {
        //A obj=new A(); //cannnot instantiate the type A. The object of the abstract class cant be created.
        A obj=new B()
        {
            public void show()
            {
                System.out.println("In A show");                        //Now if you want to Implement the Abstract class only once then then better comment it and implement it as Anonymous Inner class.
                                                                       
            }


            public void config()                          //Even if we have Multiple Methods we are free to use it.
            {
                System.out.println("In Config");
            }
        };

 
        obj.show();                                                                  
        obj.config();


    }
 }