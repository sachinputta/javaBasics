package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	
	public void method1() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hyderabad");
		list.add("Bangalore");
		list.add("Jaipur");
		list.add("Guntur");
		list.add("Delhi");
		System.out.println(list);
		System.out.println("Length of List : "+list.size());
		
		System.out.println("=============");
		// reversing the list
		Iterator<String> i = list.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			
		System.out.println("=============");
		
		// copying the list
		Object list2 = list.clone();
		System.out.println("Copied list :"+ list2);
		System.out.println("=============");
		
		//adding new element to list
		list.add("Chennai");
		list.add("Mumbai");
		System.out.println("Updated list :"+list);
		
		// removing from first and last element
		list.removeFirst();
		list.removeLast();
		System.out.println("List after removed :"+list);
		System.out.println("=============");
		
		// replacing the element
		list.set(1,"Gujarat");
		System.out.println("Repalaced list :"+list);
		System.out.println("=============");
		
				
		// retrieve the elements of the list(using peak)
		System.out.println(list);
		System.out.println("Using peek():"+list.peek() );
		String x=list.peekFirst();
		String y= list.peekLast();
		System.out.println("Using peekFist() :"+x );
		System.out.println("Using peekLast() :"+y );
		System.out.println("=============");
		
		// retrieving Specified element
		System.out.println(list);
		System.out.println("Using Element() :"+ list.element() );
		System.out.println("Using getFirst() :"+ list.getFirst() ); 
		System.out.println("Using getLast() :"+ list.getLast() );
		System.out.println("=============");
		
		// clearing the list
		list.clear();
		System.out.println(list);
		System.out.println("=============");
		
		
	}
	
	

	public static void main(String[] args) {
		
		LinkedList1 result = new LinkedList1();
		result.method1();
	

	}

}
