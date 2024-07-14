// As the Strings are Immutable we have two Classes with which we can Change the Strings and the Strings can be Muttable 
// Using Two Classes
// 1) StringBuffer --> StringBuffer is Thread Safe.
// 2) StringBuilder --> StringBuilder is not Thread Safe.
// There is a Slight Difference Between StringBuffer and StringBuilder Class.

public class Stringg2
{
    public static void main(String [] args)
    {
        StringBuffer sb=new StringBuffer("Navin");
        // System.out.println(sb.capacity());    //By default it will give the space of 16 Bytes.
        // System.out.println(sb.length());
        sb.append(" Reddy");
        System.out.println(sb);
    }
}