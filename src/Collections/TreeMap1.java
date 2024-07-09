package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "king");
		map.put(101, "queen");
		map.put(102, "minister");
		map.put(103, "soldier");
		map.put(105, "enemy");
		map.put(106,null);
		
		// accessing (type-1)
		System.out.println(map);

		// length of the map
		System.out.println("Length : " + map.size());
		System.out.println("=============");

		// Accessing the map (type-2)

		for (Map.Entry h : map.entrySet()) {
			System.out.println(h.getKey() + " : " + h.getValue());
		}
		System.out.println("=============");

		// Maintains descending order
		System.out.println("descendingMap: " + map.descendingMap());
		System.out.println("=============");

		// Maintains descending order
		System.out.println("descendingKeySet: " + map.descendingKeySet());
		System.out.println("=============");

		// ceiling --returns the least key, greater than the specified key

		System.out.println("CeilingKeySet: " + map.ceilingKey(104));
		System.out.println("=============");

		// Higher and lowerKey --returns greater or lower than the specified key

		System.out.println("HigherKeySet: " + map.higherKey(102));
		System.out.println("LowerKeySet: " + map.lowerKey(102));
		System.out.println("=============");

		// sortedMap Interfaces

		// Returns k-v pairs whose keys are less than or equal to specified key
		System.out.println("headMap: " + map.headMap(102, true));
		System.out.println("=============");

		// Returns k-v pairs whose keys are greater than or equal to the key
		System.out.println("tailMap: " + map.tailMap(102, true));
		System.out.println("=============");

		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(100, true, 103, false));
		System.out.println("=============");

		// contains values and keys
		System.out.println(map.containsValue("enemy"));
		System.out.println(map.containsKey(102));
		System.out.println("=============");

		// cloning the object

		Object map2 = map.clone();
		System.out.println("Cloned Map : " + map2);
		System.out.println("=============");

		// remove the entry
		map.remove(105);
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
