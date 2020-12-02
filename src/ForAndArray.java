package linkedin;

import java.util.ArrayList;

public class ForAndArray {

	public static void main(String[] args) {
		
		String[] greetings = {"Hello", "Good morning", "Good night"};
		
		for (String text : greetings) {
			System.out.println(text);
		}
		
		for (int i = 0 ; i < greetings.length; i++) {
			System.out.println(greetings[i]);
		}
		
		System.out.println("==========================");
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Taro");
		list.add("Jiro");
		list.add("Saburo");
		list.add("Shiro");

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		for (String item : list) {
			System.out.println(item);
		}
		

	}

}
