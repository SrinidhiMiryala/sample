package nestedClass;
abstract class Animal  {
	
	abstract void Name();    
	  
	void eat() {                     
		System.out.println("What they eat to survive");
	}                   
	}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		Animal abc = new Animal() {

		void Name() {
			// TODO Auto-generated method stub
			System.out.println("what is the animal name ");
			
		}
	};
	abc.Name();
	abc.eat();
	}
}