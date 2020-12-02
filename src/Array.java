package linkedin;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		String[] greetings = new String[3];
		
		greetings[0] = "Hello";
		greetings[1] = "Good Night";
		greetings[2] = "Good Morning";
		
//		System.out.println(greetings[0]);
//		System.out.println(greetings[1]);
//		System.out.println(greetings[2]);
		
		String[] names = {"John", "Taro", "Jiro"};
		
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add("Hey");
		list.add("What's app?");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("============================");
		
//		list.remove(0);
		list.remove("Hello"); // This code is the same to list.remove(0);
		list.add("Konnichiwa!");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

	}

}
