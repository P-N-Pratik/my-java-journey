// class A extends Thread
// {
//     public void run()
//     {
//         for( int i=0;i<=80;i++){
//             System.out.println("Hii");
//         }
//     }
// }

// class B extends Thread
// {
//     public void run()
//     {
//         for( int i=0;i<=80;i++){
//             System.out.println("Hello");
//         }
//     }
// }


// class Threads
// {
//     public static void main(String[] args) {
//         A obj1=new A();
//         B obj2=new B();

//         // obj2.show();        // obj1.show();   // Made the normal Objects threads By Inheriting the Thread Class. 



//         obj1.start();
//         obj2.start();

//     }
// }


/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
//class A extends Thread
// {
//     public void run()
//     {
//         for( int i=0;i<=80;i++){
//             System.out.println("Hii");
//             // try{
//             //     Thread.sleep(10);
                
//             // } catch (Exception e) {
//             //     System.out.println(e);
//             // }
//         }
//     }
// }

// class B extends Thread
// {
//     public void run()
//     {
//         for( int i=0;i<=80;i++){
//             System.out.println("Hello");
//             // try{
//             //     Thread.sleep(10);
                
//             // } catch (Exception e) {
//             //     System.out.println(e);
//             // }
//         }
//     }
// }


// class Threads
// {
//     public static void main(String[] args) {
//         A obj1=new A();
//         B obj2=new B();

//         // obj2.show();        // obj1.show();   // Made the normal Objects threads By Inheriting the Thread Class. 



//         obj1.start();
//         obj2.start();

//     }
// }

/*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ */


// class A implements Runnable
// {
//     public void run()
//     {
//         for( int i=0;i<=5;i++){
//             System.out.println("Hii");
//             try{
//                 Thread.sleep(10);
                
//             } catch (Exception e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class B implements Runnable
// {
//     public void run()
//     {
//         for( int i=0;i<=5;i++){
//             System.out.println("Hello");
//             try{
//                 Thread.sleep(10);
                
//             } catch (Exception e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }


// class Threads
// {
//     public static void main(String[] args) {
//         Runnable obj1=new A();
//         Runnable obj2=new B();

//         // obj2.show();        // obj1.show();   // Made the normal Objects threads By Inheriting the Thread Class. 


//         Thread t1=new Thread(obj1);  //The Objects of the Thread Class.
//                                 //Now it wont create the link unless you pass the Main's Object because one of the Constructors of the Thread Class takes an object as the arguement.
//                                 //so we need to pass the object in the constructor of the Thread Class.
//         Thread t2=new Thread(obj2);
//         // obj1.start();
//         // obj2.start();

//         t1.start();
//         t2.start();

//     }
// }

/*The Method of creating the Thread that we saw was by Inheriting the Thread Class
 * now ,The Other OPtion is BY Implementing the Runnable Interface ,Because the Thread is the Class that Implements the Runnable Interface and the Runnable Interface ofcourse has the Public Abstract void run()Method,
 * so if we Implement the Runnable Interface directly then it should work right as we in our code define the run()Method and also it works and creates the Threads.
 * Now the start() method wont work because the start Method was previously coming from the Threads Class as we were Inheriting the Thread Class.
 * Now in this case we wont be able to work with start.
 * In this case we need to create two Different Threads.
 * and instead of calling the start() methods using Objects call the method using the Object of thread Class.
 * 
 */

 /*Race Condition */
//Race Condition Example 1

/*
 * *********************** This Code has been Corrected and is been Assembled in the Class FIle named Threads1.java. ****************************************
 */

class Counter 
{
    
    
    static int count;
    
    public static synchronized void increment()
    // public static void increment()
    {
        count++;


            
    }

    
}


class A  implements Runnable
{
    // Runnable obj;
    // public void object(Runnable c)
    // {
    //     obj=c;

    // }
    public void run()
    {
    
        for( int i=1;i<=1000;i++)
        {

            Counter.increment();
            
        }
    }

}    


class B implements Runnable
{
    // Counter cc=new Counter();
    // Runnable obj;
    // public void object(Runnable c)
    // {
    //     obj=c;
    // }
    public void run()
    {                                                                   //Changes need to be made in this Code
                                                                        //Till then ,its inappropriate Code
    
        for( int i=1;i<=1000;i++)                                           //Now this Code is Appropriate   
        {

            Counter.increment();
            
        }

    }

}                                                                                                                                                                       
            

class Threads 
{
    public static void main(String[] args) throws Exception
    {
        
        
        Runnable obj1=new A();

        Runnable obj2=new B();
        

        // obj1.object(cc);
        // obj2.object(cc);

        Thread t1=new Thread(obj1);  
                               
        Thread t2=new Thread(obj2);
        
     

        t1.start();
        t2.start();
        

        t1.join();
        t2.join();
        System.out.println(Counter.count);
    }
}
     

/*----------------------------------------------------------------------------------------- */
//Race Condition Example 2
//  class Counter 
//  {
//     int count;
//     public synchronized void increment()
//    // public  void increment()
//     {
//         count++;
//     }
//  }



// public class Threads 
// {
//     public static void main(String[] args) throws Exception {
//         Counter cc=new Counter();
//         Runnable obj1 = () ->
//         {
            
            
//                 for( int i=1;i<=1000;i++)
//                 {

//                     cc.increment();
          
//                 }
//         };

        
        
//         Runnable obj2=() ->

//         {
            
            
//                 for( int i=1;i<=1000;i++)
//                 {

//                     cc.increment();
          
//                 }
//         };
        



//         Thread t1=new Thread(obj1);  
                               
//         Thread t2=new Thread(obj2);
     

//         t1.start();
//         t2.start();

//         t1.join();
//         t2.join();

//         System.out.println(cc.count);

//     }
// }
/*PS C:\Users\PratikPatil>  & 'C:\Program Files\Java\jdk-19\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\PratikPatil\AppData\Local\Temp\vscodesws_1656c\jdt_ws\jdt.ls-java-project\bin' 'Threads'
1630
Sometimes we are getting the values less than 2000 because what happens is ,as there are two threads and the situation might ocuur that both the threads access the variable count at the same time and 
perform the operation at the same time and therefore the operation that should happen two times as there are two threads happens Only once. 
Now thats the The proble of race Condition now how to make sure that only one thread at a time must get the access of the shared variable.
and In this critical case the keyword synchronized is used.
the keyword is  declared to the Method That has the Shared variable and it makes sure that only one thread at a particular time could access it.
PS C:\Users\PratikPatil>  & 'C:\Program Files\Java\jdk-19\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\PratikPatil\AppData\Local\Temp\vscodesws_1656c\jdt_ws\jdt.ls-java-project\bin' 'Threads'
2000
Now no matter what only one thread accesses the Method of the shared variable and answer would always be 2000.
*/

/* Thread States in Java*/


// NEW  ->  RUNNABLE   -                                  WAITING
//                     |
//                     ->    RUNNING ->  


//                                                     DEAD

/*
 * New -> Thread t1=new Thread();
 * Then when we say start() it goes to Runnable State.
 * There is a Difference between Runnable and Running state.
 * The start method executes and the Thread is waiting in a queue for the Scheduler to enter into the Running State.
 * The Thread when Executing the run() method ,its actually in the Running state.
 * Sometimes we need to hold the Thread And we hold it using sleep() method and that is what it enters the wainting state.
 * also wait() method can be used to hold the thread.
 * after the wait is over the notify()mathod will schedule the Thread into the Runnable State and not into the Running State and again wait for the Scheduler to schedule it for Executing.
 * Notify() method is used only when the wait() method is used.
 */
