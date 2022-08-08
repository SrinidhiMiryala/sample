package UncheckedException;

public class ArrayStoreExceptionExample {
	public static void main(String args[])
	{
		try {
			Integer a[]= new double[2];
			a[0]=10;
			}
		catch (ArrayStoreException e) {
			System.out.println("ArrayStore");
            e.printStackTrace();
		}
	}

}
