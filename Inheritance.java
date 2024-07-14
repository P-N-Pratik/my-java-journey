//SUB CLASS INHERITS THE PROPERTIES AND FEATURES OF THE PARENT CLASS.

import tools.AdvCalc;
import tools.VeryAdvCalc;

class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

     public int sub(int n1,int n2)
    {
        return n1-n2;
    }


}

public class Inheritance extends AdvCalc
{
    public static void main(String[] args)
    {
        VeryAdvCalc obj=new VeryAdvCalc();
        int r1=obj.add(4,5);
        int r2=obj.sub(7,3);
        int r3=obj.multi(7,3);
        int r4=obj.div(7,3);
         double r5=obj.power(7,3);

        System.out.println(r1);
        System.out.println(r2);
         System.out.println(r3);
          System.out.println(r4);
          System.out.println(r5);

        
    }

}

/*
 
NOW AS WE HAVE THE CALCULATOR THAT PERFORMS TWO OPERATIONS ADD AND SUB
AND WEE NEED TO MAKE THE ADVANCED CALCULATOR THAT COTAINS MUL AND DIV INCLUDING THE ADD AND SUB METHOD
HERE I CAN CREATE A CLASS CALL ADVANCED CALC AND CREATE THE MUL AND DIv METHODS IN THE ADV CALC AND SIMPLY INERIT THE CLASS CALC AND THEN MAKE THE OBJECT OF ADVCALC CLASS AND USE THE METHODS OF BOTH THE CLASSES.
INHERITING THE CLASS CALC WILL HELP IN REUSING THE CODE.
2 TYPES OF INHERITANCE:
SINGKE LEVEL MULTILEVEL
W'LL PERFORM MULTILEVEL INHERITANCE BY ,AS VERYADVCALC EXTENDS ADVCALC AND ADVCALC INHERITS (EXTENDS ) CALC.










 */