package Arraylist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;
public class ListIteratorExample{
	public static void main(String[] args) {
		List<String> names = new LinkedList<>();
		names.add("Welcome");
		names.add("To");
		names.add("java");
		names.add("class");
		ListIterator<String> namesIterator = names.listIterator();
		while(namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
			}
		for(String s:names) {
			System.out.println(s);
		}
	}
}