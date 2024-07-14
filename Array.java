public class Array
{
    public static void main(String [] args)
    {
       // int nums[][]=new int[3][4];
        int num[]={1,2,3,4,5,6,7,8,9};
       
        for(int i=0;i<9;i++){
            if(num[i]==6){
                System.out.println(num[i]=11);
            }
            else{
            System.out.println(num[i]);
            }
        }
        int nums[][]=new int[3][];    // jagged Array
        nums[0]=new int[4];
        nums[1]=new int[4];
        nums[2]=new int[4];
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                nums[i][j]=(int)(Math.random()*10);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println("");
        }


        
        
    }
}