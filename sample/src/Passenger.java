class MetroTicketCounter{
	void tickets() {
		System.out.println("1.Kukatpally 2.Jntuh 3.Hitech city");
	}
	void destination(String destination) {
		System.out.println("destination choosen is "+destination);
	}
	void destination(String destination,String destination1) {
		System.out.println("destination1 choosen is "+destination+"and"+destination1);
	}
	String destinationchoosen() {
		return "kukatpally";
	}
	String ticketCost(int Cost) {
		System.out.println("Cost for ticket is " +Cost);
		return " ";
	}
}
public class Passenger {
	public static void main(String[] args) {
	MetroTicketCounter nidhi= new MetroTicketCounter();
	nidhi.tickets();
	nidhi.destination("Kukatpally");
	System.out.println("ticket provided " +nidhi.ticketCost(50));
	}
}


