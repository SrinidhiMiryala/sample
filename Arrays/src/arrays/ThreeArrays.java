package arrays;
import java.util.Scanner;

public class ThreeArrays {
	
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				
					System.out.println("Enter the x array values");
					int x =sc.nextInt();
						System.out.println("Enter the y array values");
						int y=sc.nextInt();
						System.out.println("Enter the z array values");
						int z=sc.nextInt();
						
						int a[][][]=new int[x][y][z];
						System.out.println("Enter the x*y*z array values to store:\n");
						  for (int i = 0; i < x; i++)
							{
							    for(int j = 0; j < y; j++)
							    {
							    	for(int k=0;k<z;k++)
							    	{
						           	a[i][j][k] = sc.nextInt();
							    }
							}   
						        System.out.print("Elements in Array are :\n");
						        for (int i1 = 0; i1 < x; i1++)
							{
							    for(int j = 0; j < y; j++)
							    {
							    	for(int k = 0; k < z; k++)
								    {
							    	
							       System.out.println("a ["+i1+"]:  a ["+j+"]: a["+k+"]="+a[i1][j][k]);
						 	    }
							}  
						   }
							}
			}
}

