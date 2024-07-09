package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void method1() {
		HashSet<String> set = new HashSet<String>();

		// adding to the list
		set.add("apple");
		set.add("grapes");
		set.add("mango");
		set.add("orange");
		set.add("apple");

		System.out.println(set);
		// length of the set
		System.out.println(set.size());
		System.out.println("=============");
		
		// adding the elements
		set.add("kiwi");
		set.add("Jack fruit");
		System.out.println(set);
		System.out.println("=============");

		// iterating the elements

		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
		System.out.println("=============");
		
		// remove the specific element in the set
		boolean y = set.remove("mango");
		System.out.println(y);
		System.out.println(set);
		System.out.println("=============");
				

		// cloning the set

		System.out.println("Copied Set :" + set.clone());
		System.out.println("=============");

		// contains Specified element

		boolean x = set.contains("apple");
		System.out.println("Is Contains :" + x);
		System.out.println("=============");
		
		// set is empty or not
		System.out.println("Is Empty :" + set.isEmpty());
		System.out.println("=============");
		
		// clearing the set
		
		set.clear();
		System.out.println(set);
		System.out.println("=============");
		

	}

	public static void main(String[] args) {
		method1();
	}
}
