class Calculator{
    public int add(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
    public int add(int n1,int n2,int n3)
    {
        int r=n1+n2+n3;
        return r;
    }
    public double add(double n1,int n2)
    {
        double r=n1+n2;
        return r;
    }
    


}

class MethodOverloading {
    public static void  main(String [] args)
    {
        int num1=4;
        int num2=5;
        Calculator calc=new Calculator();
        int result1=calc.add(num1,num2);
        int result2=calc.add(1,2,3);
        double result3 = calc.add(647283,1);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
