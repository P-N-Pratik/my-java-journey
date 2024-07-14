/*
class Calculator{

    int data=10;         // Instance variable 
    public int add(int n1,int n2){         // Local variable
        int r=n1+n2;
        return r;
    }
}

public class Demo {
    public static void  main(String [] args)
    {
        int num1=4;
        int num2=5;
        Calculator calc=new Calculator();
        int result=calc.add(num1,num2);
        System.out.println(result);

    }
}





Talking about the previous program that we wrote.
In this Main Method will be running first and the Instance variables will be stored in the Stack in the Manner and then the 
(Object) reference  variable calc will also be stored in the Stack having the Value as the Address of the location in the Heap Memory and the 
and the Object will be created in the Heap Memory and there will be two things divided into two sections
here first section will have all the instatnce variables not the local variables becoz local variables are the part of stack not the part of Heap,
And also Each method has its own Stack.
The Link is Present between the Stack and the Heap
An Important Link.

Stack(add)
------------
n2=4        // local variables  
n1=5



Stack(Main)
----------
obj=101|(Complex Address of the Location in the Heap Memory where the Object is been created)
num2=5 |
num1=4 |

____________________________________
Heap (101)
----------
num=1   //Instance variable
add()   // Only the Definition









*/ 