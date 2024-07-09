package Collections;

import java.util.PriorityQueue;

public class P1 {

	public static void main(String[] args) {
	 PriorityQueue<Integer> q = new PriorityQueue<>();
	 q.add(100);
	 q.add(120);
	 q.add(150);
	 System.out.println(q);
	 System.out.println(q.element());
	 System.out.println(q.peek());
	 q.add(20);
	 // 100,120,150
	 System.out.println(q);
      
	 q.add(78);
	 
	 

	}

}
