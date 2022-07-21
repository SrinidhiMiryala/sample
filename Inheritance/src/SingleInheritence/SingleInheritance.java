package SingleInheritence;

public class SingleInheritance {
	public static void main(String[] args) {
	child child1 = new child();
	child1.son();
	child1.daughter();
}
}

class Parent{
void son() {
		System.out.println("Parent Class Method");
	}
}
class child extends Parent{
	void daughter() {
		System.out.println("Child Class Method");
	}
}