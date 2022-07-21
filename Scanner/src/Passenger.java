import java.util.Scanner;
class MetroTicketCounter{
	void tickets() {
		System.out.println("1.Kukatpally 2.Jntuh 3.Hitech city");
	}
	void destination(String destination) {
		System.out.println("destination choosen is "+destination);
	}
	void destination(String destination,int b) {
		System.out.println("destination1 choosen is "+destination+"and"+b);
	}
	String destinationchoosen() {
		return "kukatpally";
	}
	String ticketCost(int Cost) {
		System.out.println("Cost " +Cost);
		return " ";
	}
	public void cost() {
		// TODO Auto-generated method stub
		
	}
}
public class Passenger {
	public static void main(String[] args) {
	MetroTicketCounter nidhi= new MetroTicketCounter();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the destination");
	String a = sc.next();
	System.out.println("Enter the cost");
	int b=sc.nextInt();
	nidhi.cost();
	System.out.println("ticket provided");
	sc.close();
	}
}

