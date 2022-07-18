class Bank{
	void form() {
		System.out.println("1.Withdrawal 2.Deposit");
	}
	void submit(String form) {
		System.out.println("form given is "+form);
	}
	String submittedform() {
		return "Withdrawal";
	}
	
	String withdrawal(int amount) {
		System.out.println("Amount given is "+amount);
		return "Withdrawn";
	}
}
public class Customer {
	public static void main(String[] args) {
	Bank nidhi=new Bank();
	nidhi.form();
	nidhi.submit("Withdrawal");
	System.out.println("Acknowledgement " +nidhi.withdrawal(1000));
	}
}