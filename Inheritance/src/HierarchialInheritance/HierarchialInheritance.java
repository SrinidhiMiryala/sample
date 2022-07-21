package HierarchialInheritance;


public class HierarchialInheritance {
	public static void main(String[] args) {
	grandchild1 grandchild = new grandchild1();
	grandchild.son();
	grandchild.granddaughter1();
	child1 child = new child1();
	child.son();
	child.daughter();
}
}

class Parent1{
void son() {
		System.out.println("Parent Class Method");
	}
}
class child1 extends Parent1{
	void daughter() {
		System.out.println("Child Class Method");
	}

	
	}

class grandchild1 extends Parent1{
	void granddaughter1() {
		System.out.println("GrandChild Class Method");
	}
}
