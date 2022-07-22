package constructor;
public class FinalKeyword {
	int age=18;
	void Qualify() {
		age=20;
		System.out.println("eligible to vote");
	}
public static void main(String args[]) {
	FinalKeyword election= new FinalKeyword();
	election.Qualify();
}
}
