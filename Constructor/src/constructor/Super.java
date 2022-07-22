package constructor;

class Animal{
	String color="black";
	
}
class Cat extends Animal{
	String color="white";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
class Super{
	public static void main(String args[]) {
		Cat c= new Cat();
		c.printColor();
	}
}