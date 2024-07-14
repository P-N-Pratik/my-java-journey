//Definition--

class Human
{   //(1)
    // int age;  
    //private int age=11; //Not all the datas are Accessible So wnato control it so by Declaring the variable as private that clearly means the variable age is accessible only in the class Human that means we cannot access the variable from the another class.
    //private String name="Navin";     // No one from Outside world that is outside class can acess it.
                    // But there is an Indirect way to access the private variables and the way is with help of method.

    //(2)
    private int age ;
    private String name;

    public int getAge()   
    {
        return age;   // We can access the age Variable inside a method of the Same class
    } 

    //(2)
    public void setAge(int a)
    {
        age=a;
    }
    
    public String getName()
    {
        return name;    // We can access the name Variable inside a method of the Same class
    }

    //(2)

    public void setName(String n)
    {
        name=n;
    }

    
}

public class Encapsulation
{
    public static void main(String[] args) 
    {
       
        Human obj =new Human();
         //(1)
        // obj.age=11;
        // obj.name="Navin";

        //System.out.println(obj.age);  // Obviously the age is Accessible of class Human.
        //Now if Someone wants to fetch it,it is Possible with the help of Methods.
        // System.out.println(obj.getName() +" : " +obj.getAge());   // So we Accessed the Private Variables of another Class by Using The methods of that class.
        
        //------------------------------------------------------------------------------
        //(2)
        obj.setAge(11);                       // Basically we are Assigning the values with the help of Methods
                                                // and also we are getting the values with the help of Methods.
        obj.setName("Navin");


        System.out.println(obj.getName() +" : " +obj.getAge()); 


    }

}

// We are Declaring our variables as Private AND THE ONLY WAY TO ACCESS IT IS WITH THE HELP OF METHODS
// SO BASICALLY WE ARE BINDING OUR DATA WITH THE METHODS SO NOE ONE FROM THE OUTSIDE WORLD OR CLASS CAN ACCESS THE DATA DIRECTLY
// SO WE ARE ENCAPSULATING THE DATA INTO THE METHODS AND THAT IS ENCAPSULATION RIGHT.