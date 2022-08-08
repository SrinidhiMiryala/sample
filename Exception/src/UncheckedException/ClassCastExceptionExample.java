package UncheckedException;

	class Animal {

	}

	class Dog extends Animal {

	}

	class Lion extends Animal {

	}

	public class ClassCastExceptionExample {

	    public static void main(String[] args) {

	        try {
	            Animal animalOne = new Dog(); 
	            Dog simba = (Dog) animalOne; 

	            Animal animalTwo = new Lion(); 
	            Dog tommy = (Dog) animalTwo; 
	        } 
	        catch (ClassCastException e) {
	            System.out.println("ClassCastException caught!");
	            e.printStackTrace();
	        }

	    }

}
