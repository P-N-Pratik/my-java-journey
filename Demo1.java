class Computer{
    public void playMusic()
    {
        System.out.println("Playing Music ");
    }

    public Stringg getMeAPen(int cost)
    {
        if (cost==3)
        {
           return ("BellyPen");

        }
        else if(cost==5)
        {
            return ("Nataraj Pen");
        }
        else if(cost==8)
        {
            return ("Cello Gripper");
        }
        else if(cost==10)
        {
            return ("Fountain Pen");
        }
        else if(cost==45)
        {
            return ("Trimax Pen");
        }
        else
        {
               return ("No Pen Available of this Cost ");

        }

    }

}
public class Demo1
{
    public static void main(Stringg [] args)
    {
        Computer comp=new Computer();
        Stringg q=comp.getMeAPen(45);                  
        System.out.println(q);

        comp.playMusic();
    }
}
