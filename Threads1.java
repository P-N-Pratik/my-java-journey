
class Counter
{
    
    static int count;
    
    public  synchronized void increment()
    // public static  void increment()
    {
        count++;


            
    }

}

class TwoInOne 
{
    
    
    Counter cc=new Counter();
    
    class A implements Runnable
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
                //Counter.increment();   //I would have called the method increment() using the class name If the method was Static, but as it is not the Static Method it is Compulsory to call the method using the object.                  
                cc.increment();
                // System.out.println(cc.count);
                
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
        {                                                                   //Changes need to be made in this Code    ><
                                                                            //Till then ,its an inappropriate Code    ><
            for( int i=1;i<=1000;i++)                                        //Now this Code is Appropriate   -/   
            {

                cc.increment();
                // System.out.println(cc.count);
                
            }

        }

    }  
    
}                                                                                                                                                                     
            

public class Threads1 
{
    public static void main(String[] args) throws Exception
    {
        //Counter cc=new Counter();
        
        TwoInOne ob =new TwoInOne();
        Runnable obj1=ob.new A();

        Runnable obj2=ob.new B();
        

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