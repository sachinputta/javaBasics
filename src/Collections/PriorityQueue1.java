package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Sachin");
		queue.add("Rahul");
		queue.add("Nithin");
		queue.add("Sneha");
//		queue.add(null);
		queue.add("Ankitha");

		// exception handling
		try {
			queue.add(null);
		} catch (Exception e) {
			System.out.println(e);
		}

		// accessing over String Class and getting values as object type...

		System.out.println(queue);
		System.out.println("=============");

		// iterating over each element

		System.out.println("iterating the queue elements:");
		Iterator<String> h = queue.iterator();
		while (h.hasNext()) {
			System.out.println(h.next());

		}
		System.out.println("=============");

		// for each loop

		for (String i : queue) {
			System.out.println(i);

		}
		System.out.println("=============");

		// length of the queue
		System.out.println("Length : " + queue.size());
		System.out.println("=============");

		System.out.println(queue);
		System.out.println("Using Element:" + queue.element());
		System.out.println("Using Peek :" + queue.peek());
		System.out.println("=============");

		// removing the elements
		System.out.println(queue);
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements:");
		System.out.println(queue);
		System.out.println("=============");

	}

}
