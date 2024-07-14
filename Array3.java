// Array of Students

class Student
{
    int rollno;
    Stringg name;
    int marks;
}

public class Array3
{
    public static void main(Stringg [] args)
    {
        Student s1=new Student();
        s1.rollno=1;
        s1.name ="Navin";
        s1.marks=88;

        Student s2=new Student();
        s2.rollno=2;
        s2.name ="Harsh";
        s2.marks=67;

        Student s3=new Student();
        s3.rollno=1;
        s3.name ="kiran";
        s3.marks=97;

        System.out.println(s1.name +":"+s1.marks);

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name +":"+students[i].marks);
        }

        // Its an Enhanced For Loop
        // Also Known as For Each Loop

        // Here students is an Array and each Element in the Array will be Assigned to the variable n
        // and also It will Iterate for the number of times the elements are there in the Array without providing any length.


        for(Student n : students)
        {
            System.out.println(n.name + " : " + n.marks);
        }

        





    }
}