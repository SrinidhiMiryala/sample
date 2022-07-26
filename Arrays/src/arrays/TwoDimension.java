package arrays;
import java.util.Scanner;

public class TwoDimension {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
				System.out.println("Enter the x array values");
				int x =sc.nextInt();
					System.out.println("Enter the y array values");
					int y=sc.nextInt();
					int a[][]=new int[x][y];
					System.out.println("Enter the x*y array values to store:\n");
					  for (int i = 0; i < x; i++)
						{
						    for(int j = 0; j < y; j++)
						    {
					           	a[i][j] = sc.nextInt();
						    }
						}   
					        System.out.print("Elements in Array are :\n");
					        for (int i = 0; i < x; i++)
						{
						    for(int j = 0; j < y; j++)
						    {
						       System.out.println("Row ["+i+"]:  Column ["+j+"] :"+a[i][j]);
					 	    }
						}  
					   }
					}
				
