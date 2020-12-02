package linkedin;

import java.util.HashSet;
import java.util.Iterator;

public class WhileTest {

	public static void main(String[] args) {
		
		int i = 0;
		
		while( i < 10 ) {
			i++;
			
			if( i % 3 == 0) {
//				continue;
				break;
			}
//			System.out.println("i's value is " + i);
		}
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Taro");
		set.add("Jiro");
		set.add("Hanako");
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String text = iter.next();
//			System.out.println(text);
		}
	}

}
