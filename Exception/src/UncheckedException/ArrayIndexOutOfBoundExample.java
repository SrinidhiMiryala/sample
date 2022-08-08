package UncheckedException;

public class ArrayIndexOutOfBoundExample {
	public static void main(String args[])
	{
		try {
			int a[]=new int[10];
			a[11]=9;
		}
		catch(Exception a) {
			a.printStackTrace();
			System.out.println("ArrayIndexOutOfBounds");
		}
	}
}
