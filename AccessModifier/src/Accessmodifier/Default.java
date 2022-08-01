package Accessmodifier;

class Nidhi
{
	int num=13;
	void print()
	{
		System.out.println("Default number "+num);
	}
}


public class Default {
	public static void main(String args[])
	{
		Nidhi sri = new Nidhi();
		sri.print();
	}
}
