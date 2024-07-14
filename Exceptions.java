/*
 * Three types of Errors:
 * 1. Compile Time Error
 * 2. Run Time Error-> (Exception) The Run Time Errors are known as Exceptions,and we need to handle  these Run Time Errors (Exception handeling).
 * 3. Logical Error
 * 
 */

//  public class Exceptions
//  {
//     public static void main(String[] args) {
//         //Exception Hadndelling is Implemented on the Critical Statements.
//         int i=0;
//         int j=0;
//         // int j=18/i;
//         // // System.out.println(j);// It gives the Arithmetic Exception.And after this runtime Error it does not Executes the rest of the program, and thats the Problem.So even if the runtime occurs ,we must be able to execute the rst of the pogram and therefore we must handle  this Exception.
//         // // System.out.println("By");

//         //To handle this Exception the Critical statement should be defined in try Block.

//         try{
//             j=18/i; //f the First statement of the try Blockfounds the Exceeption ,then it wont go for the next statement and directly jumps on the catch Block.

//         }// The try block throws the Exception Object and it must be cathched and therefore (Exception e) as Exception Class throws the object ,and the type should be of Class Type.
//         catch (Exception e)// The catch Block will be executed only in the case of the Exception ,else it will be Skipped.
//         {
//             System.out.println("Something Went Wrong. "+ e);
//         }
//          System.out.println(j);
//          System.out.println("By");
        
//     }
//  }

 /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */


 /*Try with Multiple Catch Blocks*/

//  public class Exceptions
//  {
//     public static void main(String[] args) {
        
//         int i=0;
//         int j=0;
//         int nums[]=new int[5];
//         String str=null;

//         try{
//             //j=18/i;         //ArithmethicException
//             //System.out.println(num[5]);     //ArrayIndexOutOfBoundException
//             System.out.println(str.length());

//         }

//         catch(ArithmeticException e)                                              // Multiple catch Blocks to handle specific Exceptions
//         {
//             System.out.println("Cannot Divide  by zero");
//         }
//         catch(ArrayIndexOutOfBoundException e)
//         {
//             System.out.println("Out of Limit ");
//         }
//         catch (Exception e)
//         {
//             System.out.println("Something Went Wrong. "+ e);
//         }
//          System.out.println(j);
//          System.out.println("By");
        
//     }
//  }

//  /*Exception Hierarchy */

//                                         Object
//                                           |
//                                           Throwable (class)
//                                           |                  |
//                                         Error                Exception
//     |              |                  |                                   |                                            |                  |  
//    OUt        ThreadDeath Error        IO Error                           Runtime Exceptionn                          SqlException          IO Exception          
//     of                                                                    |                                                                   |
//     memory                                                              Arithmetic                                                            
//                                                                         ArrayIndexOutOfBoundException                                         
//                                                                         Null pointer
//All the Runtime Exceptions are called Unchecked Exception and all the  others are called Checked Exception.


/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */



public class Exceptions
 {
    public static void main(String[] args) {
        
        int i=20;
        int j=0;
        // int nums[]=new int[5];
        // String str=null;

        try{
            j=18/i;
            if(j==0)
            {
                throw new ArithmeticException("I dont want ot print Zero ");
            }

            // System.out.println(num[5]);  
            // System.out.println(str.length());

        }

        catch(ArithmeticException e)                                          
        {
            System.out.println("Cannot Divide  by zero");
        }
        // catch(ArrayIndexOutOfBoundException e)
        // {     
        //     System.out.println("Out of Limit ");
        // }
        catch (Exception e)
        {
            System.out.println("Something Went Wrong. "+ e);
        }
         System.out.println(j);
         System.out.println("By");
        
    }
 }