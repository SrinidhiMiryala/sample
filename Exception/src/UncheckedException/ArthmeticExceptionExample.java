package UncheckedException;
public  class ArthmeticExceptionExample
 {

	public static void main(String args[])
	 {
		 try {
			 int num1=13, num2=0;
			 System.out.println("num1 "+num1);
			 int output = num1/num2;
			 System.out.println("num2 "+num2);
			 System.out.println("Result: "+output);
			}
		 catch(ArithmeticException a) {
			 a.printStackTrace();
			 System.out.println("The result shouldn't be infinity");
		 }
	 }
 }