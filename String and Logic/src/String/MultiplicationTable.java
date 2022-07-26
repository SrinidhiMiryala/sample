package String;

public class MultiplicationTable {
   public static void main(String[]args) {
	   int num=5;
	   System.out.println("Multiples of 5 are:");
	   for(int i=1; i<=10;i++)
	   {
		   System.out.printf("%d*%d=%d\n",num,i,num*i);
	   }
   }
}
