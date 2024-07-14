import java.util.Scanner;
class MatrixMultiplicationLogic
{


    
    public void input(int arr[][],int a,int b)
    {
          for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }



    public void multiMatrix(int arr1[][],int arr2[][],int arr3[][],int a,int b)
    {
        for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
                arr3[i][j]=0;
				
				for(int k=0;k<a;k++){
					arr3[i][j]+=arr1[i][k]*arr2[k][j];
						
				}
				System.out.print(arr3[i][j]+"  ");
					
					
				
			
			
		//System.out.println();
		/***for(int m=0;m<3;m++){
			for(int n=0;n<3;n++){
			System.out.println(c[m][n]);
			}
		}***/
	}
	System.out.println();
	}
    }

    
}
public class MatrixMulti
{
    public static void main(String[] args)
    {
        MatrixMultiplicationLogic obj=new MatrixMultiplicationLogic();
        
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int a=sc.nextInt();
        System.out.println("Enter the Number of columns");
        int b=sc.nextInt();
        int arr1[][]=new int[a][b];
        int arr2[][]=new int[a][b];
        int arr3[][]=new int[a][b];
        
        System.out.println("Enter the Elements in the first Matrix A");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                arr1[i][j]=sc.nextInt();
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Enter the Elements in the Second Matrix B");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                arr2[i][j]=sc.nextInt();
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("The matrix A looks like :");
        obj.input(arr1,a,b);
         System.out.println("The matrix B looks like :");
        obj.input(arr2,a,b);
        System.out.println("The Multiplication of the Matrix A and B is :");
        obj.multiMatrix(arr1,arr2,arr3,a,b );

      
    }


}
