package linkedin;

public class Sample {

	public static void main(String[] args) {
		
		byte a = 127;
		short b = 100;
		int c = 100;
		long d = 100;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		float x = 1.0000000000005f;
		double y = 1.00000000000005;
		
		System.out.println(x);
		System.out.println(y);
		
		char e = 'あ';
		char f = 0x3042;
		
		System.out.println(e);
		System.out.println(f);
		
		boolean g = true;
		
		System.out.println(g);
		
		long h = 100;
		byte i = (byte)h;
		
		System.out.println(h);
		
		String text1 = "apple";
		String text2 = "Apple";
		String text3 = new String("Grape");
		
		int comp = text1.compareTo(text2);
		int comp2 = text2.compareTo(text1);
		int comp3 = text2.compareToIgnoreCase(text1);
		System.out.println(comp + "/ 2:" + comp2 + "/ 3:" + comp3);
		
	}

}
