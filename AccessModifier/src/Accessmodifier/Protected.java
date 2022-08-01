package Accessmodifier;
public class Protected
{
	int roll=1;
	protected void name()
	{
		System.out.println("Roll no is 1");
	}
}
class College extends Protected
{
	public static void main(String args[])
	{
		Protected vini = new Protected();
		vini.name();
	}
}