package Collections;

import java.util.LinkedHashMap;
import java.util.Map;



public class LinkedHashMap1 {

	@SuppressWarnings("rawtypes")

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "hyd");
		map.put(2, "delhi");
		map.put(3, "mumbai");
		map.put(4, "guntur");
		map.put(5, "hyd");
		map.put(6, "bangalore");
		map.put(5, "hyderabad");
		map.put(null, "hfndk");
		map.put(null, "djndn");

		// accessing (type-1)
		System.out.println(map);

		// length of the map
		System.out.println("Length : " + map.size());
		System.out.println("=============");

		// Accessing (type-2)
        // It returns a set view of the mappings contained in the map.
		for (Map.Entry h : map.entrySet()) {
			System.out.println(h.getKey() + " : " + h.getValue());
		}
		System.out.println("=============");

		// It replaces the specified value for a specified key.
		map.replace(3, "chennai");
		map.replace(1, "hyd", "warangal"); // old value with new value
		System.out.println(map);
		System.out.println("=============");

		// contains values and keys
		System.out.println(map.containsValue("guntur"));
		System.out.println(map.containsKey(5));
		System.out.println("=============");

		// remove the entry
		map.remove(null);
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
