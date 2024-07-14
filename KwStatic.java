   // Instance Variables
    // And the variables inside the Method are known as Local Variables.
    // so if i want the name should be same for all the objects so it must be declared as static.
    // so that all the objects can share it.
    // useful if we want the common value for all the object.
    // so i will declare the name as static.
    // And Also the static Variables can be called by their Class name.
    // Also we can use Static Variables in the Non-Static method.

    // class Mobile
    // {
    
    //         String brand;           
    //         int price;
    //         //String name;
    //         static String name;
            
    
    //         public void show()
    //         {
    //             System.out.println(brand + ":"+ price +":"+ name );
    //         }
        
    // }
    
    
    // public class KwStatic
    // {
    //     public static void main(String [] args)
    //     {
    //         Mobile obj1 = new Mobile();
    //         obj1.brand = "Apple";
    //         obj1.price = 1500;
    //         // obj1.name = "Smartphone";
    //         Mobile.name = "SmartPhone";
    
    //         Mobile obj2 = new Mobile();
    //         obj2.brand = "Samsung";
    //         obj2.price = 1700;
    //         // obj2.name = "Smartphone";
    //         Mobile.name = "Smartphone";
    
    //         // obj1.name="phone";
    //         Mobile.name = "Phone";
    
    //         obj1.show();
    //         obj2.show();
    
    //     }
    // }

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//     class Mobile
//     {
    
//             String brand;           
//             int price;
//             //String name;
//             static String name;

//             static
//             {
//                 name = "Phone";
//                 System.out.println("In the Static");
//             }

//             public Mobile()
//             {
//                 brand="";
//                 price=200;
//                 System.out.println("In the Constructor");
//             }
            
    
//             public void show()
//             {
//                 System.out.println(brand + ":"+ price +":"+ name );
//             }
        
//     }
    
    
// public class KwStatic
//     {
//         public static void main(String [] args)
//         {
//             Mobile obj1 = new Mobile();
//             obj1.brand = "Apple";
//             obj1.price = 1500;
//             // obj1.name = "Smartphone";
//             Mobile.name = "SmartPhone";
    
//             Mobile obj2 = new Mobile();
//             obj2.brand = "Samsung";
//             obj2.price = 1700;
//             // obj2.name = "Smartphone";
//             Mobile.name = "Smartphone";
    
//             // obj1.name="phone";
//             Mobile.name = "Phone";
    
//             obj1.show();
//             obj2.show();
    
//         }
//     }


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Static Method


class Mobile
    {
    
            String brand;           
            int price;
            //String name;
            static String name;

            
            
    
            public void show()
            {
                System.out.println(brand + ":"+ price +":"+ name );
            }
            
            public static void show1(Mobile obj)
            {
                // We can Use the Static Variable in the Static Method
                // But we Can't use Non Static Variable in the Static Method Directly So how can we access it Indirectly.Go below Mobile.Show()
                System.out.println(obj.brand + ":"+ obj.price +":"+ name ); 
                
                System.out.println("In Static Method"); 
            }
               
    }
        
    
    
    
public class KwStatic
    {
        // Now if there was no Static keyword declared with the main ,That means the main would have become the non static method and each time to call the main we would need the object to be created, but ,as the  first execution starts from the main SO it should be called directly when the class is loaded or being executed and therefore declaring main as static is necessary.
        public static void main(String [] args)
        {
            Mobile obj1 = new Mobile();
            obj1.brand = "Apple";
            obj1.price = 1500;
            // obj1.name = "Smartphone";
            Mobile.name = "SmartPhone";
    
            Mobile obj2 = new Mobile();
            obj2.brand = "Samsung";
            obj2.price = 1700;
            // obj2.name = "Smartphone";
            Mobile.name = "Smartphone";
    
            // obj1.name="phone";
            Mobile.name = "Phone";
    
            obj1.show();
            obj2.show();

           // Mobile.show(); // Non static Method cannot be called by Class Name,Object Must be Created Compulsorily in order to call Non Static Method
           Mobile.show1(obj1);   // Only static Method can be Called using Class Name.In order to Access the Non Static Variable in the Static Method , we Need to pass the Object in the Static Method Of type Class.
            Mobile.show1(obj2);
        }
    }



/* 

ADV.JAVA

class A
{
    int i=10;
    static int j=20;
    static void m1()
    {
        System.out.println("m1 A");
        // System.out.println(i);    --> Error
        System.out.println(j);
        A a=new A();
        System.out.println(a.i);
        // System.out.println(this.j);  --> Error
    }

    void m2()
    {
        System.out.println("m2 A");
        this.m1();
    }
}

class Test
{
    public static void main(String [] args)
    {
        A.a=new A();
        a.m1();
        A.m1();
        a.m2();
    }
}


*/