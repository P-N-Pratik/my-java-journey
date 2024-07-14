/*
 *POLYMORPHISM
 * MEANS MANY BEHAVIOUR
 * TWO TYPES OF POLYMORPHISM
 * 1. COMPILE TIME POLY(EARLY BINDING)--IF THE BEHAVIOUR IS DEFINED AT THE COMPILE TIME     -- OVERLOADING 
 * 2. RUN TIME POLY(LATE BINDING)--IF THE BEHAVIOUR IS DEFINED AT THE RUN TIME.             -- OVERRIDING
 /*
 
 /*
  *IMPLEMENTATION OF RUN TIME POLYMORPHISM USING DYNAMIC METHOD DISPATCH
  */


class A
{
    public void show()
    {
        System.out.println("In A show");
    }


}

class B extends A
{
        public void show()
    {
        System.out.println("In B show");
    }

    
}

class C extends A
{
        public void show()
    {
        System.out.println("In C show");
    }


}

public class Polymorphism 
{ 
    public static void main(String[] args) 
    {
        // we can refer the type of the object as a Parent and the object can be of child.
        A obj=new A();                  //Object obj is in the stack having the reference suppose 101 storing the show() method 
       // B obj=new B();                // and the next line calls the method and the output is i'n A show'
        obj.show();

        obj=new B();                    // Now the same object obj in the stack has the reference suppose 103 as the new objcet is created of class B and prints "in B show "
        obj.show();
        
        obj=new C();
        obj.show();
    }
    

}


/*
 * Keyword Final
 * 
 * Class ,method and variable can be Declared as Final
 * 
 * Declaring final keyword to the variables will lead the variable to be a Constant.
 * Declaring Final to the class will stop the Other classes from Inheriting it ,NO other class can extend the final class.
 * Declaring final to the Method will stop the other methods from overriding it.The final Method cant be overrided.
 */

 //Example Program for final Method

 class Calc
 {
    public final void show()
    {
        System.out.println("By me ");
    }
    
 }

 class AdvCalc
 {
    public void show()
    {
        System.out.println("By john");
    }
 }

 public class Final
 {
    public static void main(String[] args) {
        AdvCalc obj=new AdvCalc();
        obj.show();

    }
 }

 /*Basically as the Method in the Class Calc has been declared Final 
  * the Method with the same name in the class AdvCalc cannnot override it.
  */