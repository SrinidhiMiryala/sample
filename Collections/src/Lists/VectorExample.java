package Lists;

import java.util.Vector;

public class VectorExample{
	public static void main(String[] args) {
	    Vector<Integer> ll = new Vector<Integer>();
	    ll.add(12);
	    ll.add(14);
	    ll.add(17);
	    ll.add(23);
	    ll.add(20);
	    ll.add(28);
	    ll.add(35);
	    ll.add(60);
	    ll.add(55);
	    System.out.println(ll);
	    System.out.println(ll.get(1));
	    ll.set(3,10);
	    System.out.println(ll);
	    
	  }

}
