// class A
// {
//     public A()
//     {
//         //Super();
//         System.out.println("In A");
//     }
//     public A(int n)
//     {
//         //Super();

//         System.out.println("In A int");

//     }


// }

// class B extends A
// {
//     public B()
//     {
//         //Super();
//         System.out.println("In B");
//     }

//     public B(int n)
//     {
//         //Super();
//         System.out.println("In B int");

//     }

// }

// public class Super
// {
//     public static void main(String[] args) {
//         B obj=new B(3);

//     }
// }

/*
/LINE 18/ AS THE OBJECT IS CREATED IT CALLS THE CONSTRUCTOR OF THE CLASS 'B' BUT WHAT IF WE CREATE THE CONSTRUCTOR IN CLASS 'A' TOO.
In A
In B
PS C:\Users\PratikPatil> 
IT ALSO CALLS THE CONSTRUCTOR TOF THE SUPER CLASS.
IT CALLS THE CONSTRUCTOR OF THE SUB CLASS AND THE SUPER CLASS BOTH.
LETS CREATE THE PARAMETERIZED CONSTR IN 'B'
TO CALL THE PARAMETERIZED CONSTR THE VALUES MUST BE PASSED IN THE CONSTRUCTOR
SO AS WE PASS THE VALUE IN THE  CONSTRUCT.IT CALL THE PARAMETERIZED CONSTRUCTOR OF THE CLASS 'B' AND DEFAULT CONSTRUCT OF CLASS 'A'.
In A
In B int
PS C:\Users\PratikPatil> 
BUT WHAT IF WE HAVE PARAMETERIZED CONSTRUCT IN CLASS 'A'.
THEN TOO IT WILL PRINT THE SAME
In A
In B int
THE QUESTION IS WHY IS IT CALLING THE CONSTRUCT OF THE PARENT CLASS.
EVERY CONSTRUCTOR IN JAVA HAS A METHOD CALLED SUPER()
AND AS THE CONSTRUCTOR IS CALLED IT EXECCUTES FIRST LINE OF THE CONSTRUCTOR METHOD THAT IS THE SUPER METHOD WHICH CALLS THE CONSTRUCTOR OF THE  PARENT CLASS
BYDEFAULT IN EVERY CONSTRUCTOR THE FIRST STATEMENT IS THE SUPER()METHOD.
SUPER MEANS CALL THE CONSTRUCTOR OF THE PARENT CLASS AND UNTIL THE VALUE IS NOT PASSED IN THE SUPER(4) METHOD IT WILL ALWAYS CALL THE DEFAULT CONSTRUCT()METHOD.
//EVERY CLASS IN JAVA EXTENDS THE OBJECT CLASS
OBJECT CLASS IS THE PARENT CLASS OF ALL THE CLASSES IN JAVA.



NOW IF WE WANT THE OUTPUT AS 
IN A
IN B
IN B INT

THEN THE CODE GOES LIKE THIS
*/ 


class A
{
    public A()
    {
        //Super();
        System.out.println("In A");
    }
    public A(int n)
    {
        //Super();

        System.out.println("In A int");

    }


}

class B extends A
{
    public B()
    {
        //Super();
        System.out.println("In B");
    }

    public B(int n)
    {
        //Super();
        this();                      // NOW THIS()METHOD WILL CALL THE CONSTRUCTOR OF THE SAME CLASS.AND ABOVE THIS THE SUPER WILL CALL THE CONSTRUCTOR OF THE PARENT CLASS.
        System.out.println("In B int");

    }

}

public class Super
{
    public static void main(String[] args) {
        B obj=new B(3);

    }
}