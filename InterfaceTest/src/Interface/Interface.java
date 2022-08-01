package Interface;

interface Animal{
	public  void animalsound();
	public void sleep();
	
}
class Cat implements Animal{
	public void animalsound() {
		System.out.println(" The cat sound is meow");
	}
	public void sleep() {
		System.out.println(" The cat sleep 7 hours");
	}
}
public class Interface {

	public static void main(String[] args) {
		Cat cat =  new Cat();
		cat.animalsound();
		cat.sleep();
	}

}


