
public class ConvertStatictoInstance {
	static String s="Nidhi";
	void employee()
	{
		System.out.println("s ="+s);
		s = "Pranavi";
		System.out.println("s ="+s);
	} 
	public static void main(String[] args) {
		ConvertStatictoInstance staticinstancemethod = new ConvertStatictoInstance();
		staticinstancemethod.employee();
		
		
	}

}
