package Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque<String> dequeArr = new ArrayDeque<String>();
		dequeArr.add("Hyderabad");
		dequeArr.add("Delhi");
		dequeArr.add("Goa");
		dequeArr.add("Pune");
		dequeArr.add("Mumbai");
//		dequeArr.add(null);
		dequeArr.add("Mumbai");

		// exception  
		try {
			dequeArr.add(null);
		} catch (Exception e) {
			System.out.println(e);
		}

		// accessing over String Class and getting values as object type...

		System.out.println(dequeArr);
		System.out.println("=============");

		// length of the queue
		System.out.println("Length : " + dequeArr.size());
		System.out.println("=============");

		// iterating over each element

		System.out.println("iterating the queue elements:");
		Iterator<String> itr = dequeArr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("=============");

		// for each loop

		for (String i : dequeArr) {
			System.out.println(i);

		}
		System.out.println("=============");

		
		System.out.println(dequeArr);
		System.out.println("Using Element:" + dequeArr.element());
		System.out.println("Using Peek :" + dequeArr.peek());
		System.out.println("Using PeekFirst :" + dequeArr.peekFirst());
		System.out.println("Using PeekLast :" + dequeArr.peekLast());
		System.out.println("=============");

		// removing the elements
		System.out.println(dequeArr);
		dequeArr.remove();
		dequeArr.poll();
		System.out.println("After removing two elements:");
		Iterator<String> itr2 = dequeArr.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println(dequeArr);
		System.out.println("=============");

		// inserting the elements

		System.out.println(dequeArr);
		dequeArr.offer("Chennai"); // used to insert the element into the queue
		dequeArr.offerFirst("Jaipur"); // insert at first
		dequeArr.offerLast("Lucknow"); // insert at last
		System.out.println(dequeArr);

		System.out.println("=============");

	}

}
