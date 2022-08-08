package Abstract;

		
abstract class Parents {
		abstract  void lifeSpan();
		

		void breadth() {
			System.out.println("Takes the oxygen");
		}
	}

	class Son extends Parents {
		void lifeSpan() {
			System.out.println("lifespan of Son is 50 years");
		}
	}

	class Daughter extends Parents {
		void lifeSpan() {
			System.out.println("lifespan of Daughter is 40 years");
		}

	}

	public class Kids {
		public static void main(String[] args) {
			Son Dev = new Son();
			Dev.lifeSpan();
			Dev.breadth();
			Daughter durga = new Daughter();
			durga.lifeSpan();
			durga.breadth();

		}

	}


