package Lists;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(20);
		s.push(13);
		s.push(70);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
	}

}
