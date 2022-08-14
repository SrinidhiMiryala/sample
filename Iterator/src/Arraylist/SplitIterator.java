package Arraylist;


	import java.util.ArrayList;
	import java.util.Spliterator;

	public class SplitIterator {

	  public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Maruthi");
	    cars.add("BMW");
	    cars.add("Benz");
	    cars.add("Creta");
	    cars.add("Nissan");
	    
	    
	    Spliterator<String> s = cars.spliterator();
	    System.out.println("Exact size : "+s.getExactSizeIfKnown());
        System.out.println("Estimated size :"+s.estimateSize());
        System.out.println("Characterstics :"+s.characteristics());
        System.out.println("Characterstics :"+s.hasCharacteristics(s.characteristics()));
        System.out.println("Equals :"+s.equals(s));
        
	    
	    
	  }

	}
	
