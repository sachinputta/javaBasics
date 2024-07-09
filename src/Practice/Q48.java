package Practice;
import java.util.*;




/*
 48) Write a program to remove the duplicate elements from a list =[2,3,3,3,65,4,3,3,2]
 */
public class Q48 {
	
	public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<Integer>();
	list.add(2);
	list.add(3);
	list.add(3);
	list.add(3);
	list.add(65);
	list.add(4);
	list.add(3);
	list.add(3);
	list.add(2);
	
	System.out.println(list);
	
	Set<Integer> set = new HashSet<>(list);
	System.out.println(set);
	
	
	
	
	
	}

	
}
