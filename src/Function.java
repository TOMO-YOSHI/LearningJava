import java.util.Scanner;

public class Function {

	public static void announceDeveloperTeaTime() {
		System.out.println("Waiting for developer tea time...");
		System.out.println("Type in a random word and press return to start develper tea time.");
		Scanner input = new Scanner(System.in);
		input.next();
		System.out.println("It's a developer tea time!");
	}
	
	public static void main(String[] args) {
		announceDeveloperTeaTime();
	}

}
