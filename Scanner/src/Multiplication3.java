import java.util.Scanner;
class Multip {
	     void multip() {
   	         System.out.println();
	     }
         void multip(int x,int y) {
        	 System.out.println("The multip of integer= "+(x*y));
         }
         void multip(int x, int y,int z) {
        	 System.out.println("the multip of float= "+(x*y*z));
         }
}
public class Multiplication3{
	public static void main(String args[]) {
	Multip nidhi = new Multip();
	//nidhi.multip();
	//nidhi.multip(1, 5);
	//nidhi.multip(15,2);
	//nidhi.multip(8,2,5);
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a value of x=");
	int a = sc.nextInt();
	System.out.println("Enter a value of y=");
	int b=sc.nextInt();
	System.out.println("Enter a value of z=");
	int c=sc.nextInt();
	nidhi.multip(a,b,c);
	sc.close();
}
}
