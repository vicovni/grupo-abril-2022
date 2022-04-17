package mx.com.proyecti.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		
		set.add("one");
		
		for(String item: set) {
			System.out.println("Item " + item);
		}
	}

}
