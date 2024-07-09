package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(55);
		set.add(60); 
		set.add(30);

		System.out.println(set);

		// length of the set
		System.out.println("Length : " + set.size());
		System.out.println("=============");

		// iterating the elements
		Iterator<Integer> i = set.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("=============");

		// retrieve and remove lowest first and highest last element
		System.out.println(set);
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());

		System.out.println(set);
		System.out.println("=============");

		// returns the closest greatest and lowest element
		System.out.println(set);
		System.out.println(set.higher(40));
		System.out.println(set.lower(30));

		System.out.println("=============");

		// returns the equal or closest greatest and lowest element
		System.out.println(set);
		System.out.println(set.ceiling(40));
		System.out.println(set.floor(29));

		System.out.println("=============");

		// remove the specific element in the set
		boolean y = set.remove(69);
		System.out.println("Is present: " + y);
		System.out.println(set);
		System.out.println("=============");

		// set is empty or not
		System.out.println("Is Empty :" + set.isEmpty());
		System.out.println("=============");

		// contains Specified element

		boolean x = set.contains(60);
		System.out.println(set);
		System.out.println("Is Contains :" + x);
		System.out.println("=============");

		// clearing the set

		set.clear();
		System.out.println(set);
		System.out.println("=============");

	}

}
