package linkedin;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("John");
		set.add("Jenifer");
		set.add("Bob");
		
		set.add("John");
		set.add("John");
		
		set.remove("John");
		
//		System.out.println(set.size());
//		System.out.println(set);
//		System.out.println(set.contains("Bob"));
//		System.out.println(set.contains("Jean"));
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("apple", "りんご");
		map.put("orange", "みかん");
		
		System.out.println(map.get("apple"));
		System.out.println(map.get("りんご"));
		
		map.remove("orange");
		System.out.println(map.get("orange"));
		
		System.out.println(map);
		System.out.println(map.size());

	}

}
