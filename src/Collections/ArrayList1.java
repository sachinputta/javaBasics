package Collections;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("grapes");
		list.add("apple");
		list.add("banana");
		list.add("orange");
		

		System.out.println("Original List" + list);

		System.out.println("Length of list: " + list.size());

		// cloning the list
		Object list2 = list.clone();
		System.out.println("Cloned List : " + list2);

		// adding at the index position
		list.add(3, "pineapple");
		System.out.println("Added List: " + list);

		// removing at particular index
		list.remove(1);
		System.out.println("Removed from List : " + list);

		// replace the element at particular index
		list.set(1, "kiwi");
		System.out.println("Replaced List : " + list);

		// return the index of the element
		int x = list.indexOf("banana");
		System.out.println("Index No : " + x);

		// contains the specific element
		boolean y = list.contains("grapes");
		System.out.println("Contains in List : " + y);

		// remove all elements from the list
		list.removeAll(list);
		System.out.println("Cleared List : " + list);
	}
}
