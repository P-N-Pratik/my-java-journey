/*There are Three Differenet Types of Collection
 * 1. Collection API  ->Concept (In this Concept we have Multiple Classes and Interfaces to work with)
 * 2. Collection        ->Interface
 * 3. Collections           ->Class
 */
 
 /*
  *Collection Interface belongs to java.util Package.
Collection is the Interface;
API simply means the Library or some feature which you can simply use it we dont have to implement them.
                                    Iterable
                                        |
                                    Collection
                                      |
                             List         Queue        Set         
                                |           |           |
                             ArrayList      Dequeue    Hashset     
                            LinkedList                 Linkedset
Collection is the Inetrface 
list ,Queue,and Set are the INterfaces that basically implements or extends the Collection.and Multiple Classes implements these Interface. 
Integer is the Class which is the Wrapper Class for the int Type
and Collection wroks with the Object so if we want to store the Integer values we need to use The Class Integer in the angular bracket.
If you just wnat to add value and fetch ,then the Collection makes Sense but if we want to work with Index values then we must use List(List is an Interface that Implements or extends Collection)
List does Suppports the Repeated Value
but sometimes we need the Collection that takes only Unique Values and for that we use the Interface (Set)
Collection Extends the Class Iterable
 */

// import java.util.Collection;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.Set;
// import java.util.HashSet;
// import java.util.TreeSet;

// // public class Collect
// // {
// //   /**
// //  * @param args
// //  */
// // public static void main(String[] args) 
// //   {
// //     //Collection<Integer> nums=new ArrayList<Integer>();
// //     List<Integer> nums=new ArrayList<Integer>();
// //     nums.add(5);
// //     nums.add(3);
// //     nums.add(4);
// //     nums.add(9);
// //     nums.add(5);
        

// //     // System.out.println(nums.indexOf(5));//To get the Index on the arguement value
// //     // System.out.println(nums.get(1));  //To get the value on the arguement Index

// //     // System.out.println(nums);
// //     for(Object n : nums)
// //     {
// //     int num=(Integer)n;
// //     System.out.println(num+2);
// //     }
// //   }
// // }

// /*Set Interface Using Hashset Class That Implements the Set Interface. */
// /*
//  * Set does not cnosiders the Repeated value ,we are free to add them but the set wont Consider it
//  * Set does not stores the value in the sequence \ also it does not has the index values.
//  * Set is Basically the Collection of UniqueValue.
//  */

// public class Collect
// {
//   /**
//  * @param args
//  */
// public static void main(String[] args) 
//   {
//     //Collection<Integer> nums=new ArrayList<Integer>();
//     // Set<Integer> nums=new HashSet<Integer>();  ..If we want all the values to be Unique.
//     Set<Integer> nums=new TreeSet<Integer>();   //If we want all the values to be in the Sorted Format. Now the values will be printed in the Sortd Manner.
//     nums.add(5);
//     nums.add(3);
//     nums.add(4);
//     nums.add(9);
//     nums.add(5);
        

//     // System.out.println(nums.indexOf(5));//To get the Index on the arguement value
//     // System.out.println(nums.get(1));  //To get the value on the arguement Index

//     // System.out.println(nums);
//     for(Object n : nums)
//     {
//     int num=(Integer)n;
//     System.out.println(num+2);
//     }
//   }
// }

/* _________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________*/


/*MAP */


/*
 * Map ia an Interface 
 * It is Basically is the Combination of the Set nand the List
 * It provides the values in the form of Pythons Dictionary
 * In the Key and Value Form
 * Both HashMap and the Hashtable are almost same 
 * but the only difference is:The new Implementation of the Collection that is Hashtable is Synchronized.
 * So if we have Multiple Theads working then it better to use Hashtable to make it Synchronized.
 * 
 * 
 */

 import java.util;
 import java.util.Map;
 import java.util.HashMap;
import java.util.Hashtable;
 public class Collect
 {
    public static void main(String[] args) 
    {
        // Map<String,Integer> students=new HashMap<>();
        Map<String,Integer> students=new Hashtable<>();

        students.put("navin",56);
        students.put("harsh",42);
        students.put("kiran",59);
        students.put("sushil",32);
        students.put("rahul",64);

        System.out.println(students);
        System.out.println(students.keySet());  //Provides all the Keys in th Set.

        for (String key : students.keySet())
        {
            System.out.println(key +" : "+ students.get(key));
        }
    }
 }