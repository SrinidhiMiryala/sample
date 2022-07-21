import java.util.Scanner;
class Mul {
         void mul(int x,int y) {
        	 System.out.println("The mul of integer= "+(x*y));
         }
         void mul(float x, float y) {
        	 System.out.println("the mul of float= "+(x*y));
         }
}
public class Multiplication{
	public static void main(String args[]) {
	Mul nidhi = new Mul();
	//nidhi.mul(10, 5);
	//nidhi.mul(15,20);
	//nidhi.mul(8f,2.5f);
	//nidhi.mul(5.5f,6f);
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a value of x=");
	int a = sc.nextInt();
	System.out.println("Enter a value of y=");
	int b=sc.nextInt();
	nidhi.mul(a,b);
	sc.close();
}
}