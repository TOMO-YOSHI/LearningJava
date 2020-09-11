import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean inOnRepeat = true;
		while (inOnRepeat) {
			System.out.println("Pleaing acurrent song");
			System.out.println("Would you like to take this song off repeat? If so, answer yes");
			String userInput = input.next();
			
			if (userInput.equals("yes")) {
				inOnRepeat = false;
			}
		}
		System.out.println("Playing next song");
	}

}
