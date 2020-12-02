package linkedin;

public class DoWhile {

	public static void main(String[] args) {
		
		int i = 1000;
		
		while(i<10) {
			i++;
			System.out.println("The value of i is " + i);
		}
		
		do {
			i++;
			System.out.println("The value of i is " + i);
		} while (i < 10);

	}

}
