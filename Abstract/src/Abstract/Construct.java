package Abstract;

abstract class Parents  {
	abstract void addFeatures(String name, int age, double height);
	Parents(){
		System.out.println("Parents constructor");
	}
}

class child extends Parents {

	child(String Name){
		
		System.out.println("Son constructor");
	}
	void addFeatures(String name, int age, double height) {
		System.out.println("Dev" + " " + 30 + " " + height);

	}

}

public class Construct {

	public static void main(String[] args) {
		child child1 = new child("Ram");
		child1.addFeatures("Ram", 40 , 5.6);
	}
}