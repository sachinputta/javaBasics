package Collections;

import java.util.HashMap;
import java.util.Map;
@SuppressWarnings("rawtypes")

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("mangoes", 20);
		map.put("apple", 10);
		map.put("banana", 12);
		map.put("oranges", 5);
		map.put("mangoes", 10);
		map.put("", 10);
		map.put("", 20);
		

		// accessing (type-1)
		System.out.println(map);
		
		// length of the map
		System.out.println("Length : " + map.size());
		System.out.println("=============");
		
		//Accessing (type-2)
		
		for( Map.Entry h:map.entrySet()) {
			System.out.println(h.getKey() + " : " + h.getValue());
		}

		System.out.println("=============");
		
		// 	It replaces the specified value for a specified key.
		map.replace("oranges" , 14);
		map.replace("banana",12, 15); // old value with new value
		System.out.println(map);
		System.out.println("=============");
		
		// contains values and keys

		System.out.println(map.containsValue(16));
		System.out.println(map.containsKey("apple"));
		System.out.println("=============");
		
		// remove the entry
		map.remove("apple");
		System.out.println(map);
		System.out.println("=============");
		
		// map is empty or not
		System.out.println("Is Empty :" + map.isEmpty());
		System.out.println("=============");
		
		
		// clearing the map
		map.clear();
		System.out.println(map);
		System.out.println("=============");
		
		
	}

}
