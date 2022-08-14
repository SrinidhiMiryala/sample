package Sets;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(89);
		ts.add(70);
		ts.add(25);
		ts.add(36);
		ts.add(45);
		TreeSet<Character> TS=new TreeSet<Character>();
		TS.add('j');
		TS.add('a');
		TS.add('v');
		TS.add('a');
		System.out.println(TS);
		System.out.println(ts);
		System.out.println(TS.isEmpty());
		System.out.println(" will TS object contains s" +TS.contains("s"));	
	}

}
