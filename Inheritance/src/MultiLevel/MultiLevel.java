package MultiLevel;

public class MultiLevel {
	public static void main(String[] args) {
	grandchild grandchild = new grandchild();
	grandchild.son();
	grandchild.daughter();
	grandchild.granddaughter();
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
class grandchild extends child{
	void granddaughter() {
		System.out.println("GrandChild Class Method");
	}
}