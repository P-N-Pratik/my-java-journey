//DEFAULT VS PARAMETERIZED CONSTRUCTORS

class Humans
{
    private int age;   // Instance Variable
    private String name;

    public Humans()                                   //Normal Constructor or Default Constructor
    {
         age=12;
         name="John";

        // System.out.println("In a Constructor");

    }

    public Humans(int a,String n)                       // Parameterized Constructor
    {
        age=a;
        name=n;

    }

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
public class DvsPConstructors
{
      public static void main(String [] args)
    {
        Humans obj1=new Humans();
        Humans obj2=new Humans(18,"parvin");
        // System.out.println(obj1.getAge() + " :" + obj1.getName());   // provides 0:null ,that means the object is created in the Heap and the default values will be assigned to int age and  string name that are instance varaibles.
                                                                        // But what if we want the dafault values as the object is Created.So therefor we wil use the Constructors
        // obj1.setAge(11);
        // obj1.setName("Navin");

        System.out.println(obj1.getAge() + " :" + obj1.getName());
        System.out.println(obj2.getAge() + " :" + obj2.getName());

    }
}
    

// THE DEFAULT CONSTRUCT() WILL BE CALLED IMPLICITLY  EVEN IF WE DO NOT MENTION THE CONSTRUCTOR IN THE CODE