import java.util.Scanner;

public class Sum {
	int i,n=0,s=0;
	{
		System.out.println("Input the 5 numbers:");
for(i=0;i<5;i++)
{
	n=new Scanner(System.in).nextInt();
	s+=n;
}
System.out.println("The sum of 5 no is:"+s);
}
}
