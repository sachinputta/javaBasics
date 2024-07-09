package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(30);
		set.add(30);
		System.out.println(set);

		// length of the set
		System.out.println("Length : " + set.size());
		System.out.println("=============");

		// iterating the elements
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("=============");

		// adding the elements

		set.add(45);
		set.add(67);
		System.out.println(set);
		System.out.println("=============");

		// remove the specific element in the set
		boolean y = set.remove(69);
		System.out.println("Is present: " + y);
		System.out.println(set);
		System.out.println("=============");

		// cloning the set

		System.out.println("Copied Set :" + set.clone());
		System.out.println("=============");

		// contains Specified element

		boolean x = set.contains(60);
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

}
