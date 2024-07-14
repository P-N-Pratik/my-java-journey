

// interface Computer  
// {
//     void code();    // NO NEED TO DECLARE THE METHOD AS PUBLIC ABSTRACT BECAUSE BYDEFAULT ALL THE METHODS IN THE INTERFACE ARE DECLARED AS PUBLIC ABSTRACT.AND ALSO WE NEED TO DECLARE IMPLEMENTS IN THE PLACE OF EXTENDS
// }




// // abstract class Computer  (2)  // SO NOW WE THINK THAT ALSO WE CAN USE THE INTERFACE ,AND THAT'S DONE ABOVE.
// // {
// //     public abstract void code(); 
// // }



// // class Computer   (1)
// // {
// //     public void code()  //AS THIS CLASS DOES NOT DOES ANYTHING SO IT CAN BE DECLARED AS ABSTRACT CLASS AND AS THERE'S NO CONTENT INSIDE THE METHOD OF THIS CLASS THE METHOD CAN BE DECLARED ABSTRACT.SO THAT IS DONE ABOVE.
// //     {
        
// //     }
// // }
// class Laptop implements Computer
// {
//     public void code()
//     {
//         System.out.println("code, compile, run");
//     }

// }
// class Desktop implements Computer
// {
//     public void code()
//     {
//         System.out.println("code, compile, run : faster");
        
//     }

//     // public Computer config(int a,int b)
//     // {
//     //     System.out.println("In a config"+a+"and "+b);
//     //     return config(code());
//     // }

// }
// class DevApp
// {
//     public void devApp(Computer obj)         //NOW THE DEVAPP CLASS IS NOT DEPENDENT ON ANY CLASS SUCH AS LAPTOP OR DESKTOP ,AS NOW IT CAN EXECUTE THE METHOD OF ANY CLASS BECOZ THE OBJECT THAT IS PASSED TO THE METHOD IS OF TYPE COMPUTER TO WHICH ALL THE CLASSES INHERITS THAT MEANS THE COMPUTER CLASS WHICH IS THE PARENT OF THE CLASSES OF WHICH THE METHOD NEEDS TO BE EXECUTED. 
//     {
//         //System.out.println("coding...");
//         obj.code();
      
//     }
// }




// public class Interface
// {
//     public static void main(String[] args) 
//     {
//         Computer lap=new Laptop();
//         Computer desk=new Desktop();
//         // Computer con=Desktop.config(4,5);

//         DevApp navin=new DevApp();
//         navin.devApp(desk);
//         //navin.devApp(desk);

//     }

// }


/*
 * The Abstract class with all the abstract methods, that only has abstract methods than its better alternative to declare the class as Interface.
 * Now What Changes 
 * Interface is not the Class
 * Every method in the Interface is bydefault declared as Public abstract.
 * If the class That Implements the Interface fails to define all the abstract methods then bydefault it will also be declared as abstract Class.
 * As the Interface do not have there own memory in the heap therefore the variables are final.
 * One Class can Implement Multiple Interfaces thats not  the case with the abstract Class as in abstract class we can extend only one class.
 * 
 */


 /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */


//  interface A 
//  {
//     int age=44;   //variables can also be Declared but they are Byfault (Final and Static) and therefor we have to Initialize the variabeles
//     String area="Mumbai";           // As these Variables are Static therfore we do not need the object to access them.


//     void  show();
//     void config();


//  }


//  interface X
//  {
//     void run();
//  }


//  interface Y extends X        //interface can extend another interface (inheritance)
// {

// }

// //class B implements A,Y
//  class B implements A,X 
//  {
//     public void show()
//     {
//         System.out.println("In show");
//     }

//     public void config()
//     {
//         System.out.println("In Config");
//     }

//      public void run()
//     {
//         System.out.println("running");
//     }
//  }

//  class Interface
//  {
//     public static void main(String[] args) {
//        //A obj=new A();  //Cannot instantiate the type A,The object of the Interface cant be Created.  
//        A obj=new B();
//        obj.show();
//        obj.config();

//        //In order to execute the run()Method we need to create the Object the Class B that refers to the type of the Interface X.
//        X obj1=new B();
//        obj1.run();
       

//        System.out.println(A.area);  //variables Accessed using the Interface Name directly without using the Object.
//                                    //As they are final they cant be manipulated.
    



    
    

//     }
//  }

 /*--------------------------------------------------------------------------------------------------------------------------------------------------- */

 // Functional Interface --  Its the Interface that has Only One Method.

@functionalInterface  //Annotation
 interface A 
 {
   void show();
   
 }

 public class Interface
 {
   public static void main(String[] args) {
      A obj=new A()
      {
         public void show()
         {
            System.out.println("In show");
         }
      };
      obj.show();
   }

 }

 /*TYPES OF INTERFACES */
 /* 1.NORMAL IN  ->The Interface having Two or More Methods is known as Normal Interface.
    2.FUNCTIONAL IN  ->The Interface having Only single Method is known as Functional Interface.
    3.MARKER IN ->The Interface having no Methods.
     */