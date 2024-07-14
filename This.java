// class HumanBeing
// {
//     private int age;   // Instance Variable
//     private String name;

//     public int getAge() {
//         return age;
//     }
//     public void setAge(int a) {      // The variable 'a' is a Local variable. 
//         age = a;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String n) {
//         name = n;
//     }
    
    
    
// }

// public class This 
// {
//     public static void main(String [] args)
//     {
//         HumanBeing obj1=new HumanBeing();
//         obj1.setAge(11);
//         obj1.setName("Navin");

//         System.out.println(obj1.getAge() + " :" + obj1.getName());

//     }
// }

// What is Happening here
// Starting from the very first Point

// THE OBJECTS REFERENCE VARIABLE IS IN THE STACK HOLDING THE ADDRESS OF THE LOCATION IN THE HEAP WHERE THE OBJECT IS BEEN CREATED.
// NOW,AS THE OBJECT IS OF THE CLASS HUMANBEING THE INSTANCE VARIABLES ARE INSTANTIATED TO THE OBJECT.
// BOTH AGE 
//      NAME
// NOW USING THE OBJ1 WE ARE CALLING THE SETAGE() METHOD OF THE CLASS HUMANBEING
// AND THE LOCAL VARIABLE 'a' IS ASSIGNED WITH THE VALUE 11 THAT HAS BEEN PASSED IN THE METHOD AND THEN IT ASSIGNS THE VALUE OF 'a' IN THE VARIABLE AGE
// THEREBY ASSIGNING THE INSTANCE VARIABLE OF THE CLASS HUMANBEING AS 11 AND THEN SIMPLY IT CAN BE FETCHED THROUGH GETAGE() METHOD.


// BUT THE TWIST IS :
// IF THE GETAGE METHOD HAS THE LOCAL VARIABLE WITH THE SAME NAME AS OF THE INSTANCE VARIABLE THEN THE QUESTION IS HOW TO DIFFERENTIATE BETWEEN LOCAL VARIABLE AND THE INSTANCE VARIABLE.
// AND THEREFORE WE USE THIS KEYWORD


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


// class HumanBeing
// {
//     private int age;   // Instance Variable
//     private String name;

//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {      // The variable 'a' is a Local variable. 
//         age = age;
//     }
//     public String getName() {                     // As we saw this age variable is assigning the value to itself as giving first priority to the local variable and therefor to differentiate between the Instance variable and the local variable we use This keyword.
//         return name;
//     }
//     public void setName(String name) {
//         name = name;
//     }
    
    
    
// }

// public class This 
// {
//     public static void main(String [] args)
//     {
//         HumanBeing obj1=new HumanBeing();
//         obj1.setAge(11);
//         obj1.setName("Navin");

//         System.out.println(obj1.getAge() + " :" + obj1.getName());

//     }
// }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class HumanBeing
{
    private int age;   // Instance Variable
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {      // The variable 'a' is a Local variable. 
        this.age = age;
    }                                          // Now this.age and this.name is differentiated as the Instance variable
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    
}

public class This 
{
    public static void main(String [] args)
    {
        HumanBeing obj1=new HumanBeing();
        obj1.setAge(11);
        obj1.setName("Navin");

        System.out.println(obj1.getAge() + " :" + obj1.getName());

    }
}