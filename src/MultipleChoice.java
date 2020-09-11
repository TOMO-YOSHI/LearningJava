import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
		boolean repeat = true;
		Scanner input = new Scanner(System.in);		
		
		while (repeat) {
			String question = "Where is Tomohiro from?";
			String choiceOne = "India";
			String choiceTwo = "Japan";
			String choiceThree = "China";
			
			String correctAnswer = choiceTwo;
			
			System.out.println(question);
			System.out.println(choiceOne);
			System.out.println(choiceTwo);
			System.out.println(choiceThree);
			
			String userAnswer = input.next();
//			System.out.println(userAnswer);
//			System.out.println(correctAnswer.toLowerCase());
			
			
			if (userAnswer.toLowerCase().equals(correctAnswer.toLowerCase())) {
				System.out.println("You are correct!!");
				repeat = false;
			} else {
				System.out.println("You are wrong...");
				System.out.println("Please try again!!");
			}
			
		}
		
	}

}
