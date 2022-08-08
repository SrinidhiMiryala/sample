package UncheckedException;

public class NullPointer {
	public static void main(String args[])
	{
		try {
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException a) {
			a.printStackTrace();
			System.out.println("NullPointerException..");
		}
	}

}
