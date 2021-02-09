import java.util.Scanner;

// Auther : Sidheshwari Sajjanshetty 
// Multiple choice questions (mini project)
// using while loop , if-else block  
public class Main {

	public static void main(String[] args) {
		
		String question = "How many months have 28 days ?"; 		 
		String option1 = "1";
		String option2 = "3";
		String option3 = "12";
		
		String correctAnswer = option3; 
		boolean doYouWantToContinue = true;
		
		while(doYouWantToContinue) {
			
			// print question
			System.out.println("Plese, read following question and choose right answer... "+"\n");
			System.out.println(question);
			// provide multiple choices to choose 
			System.out.println(option1+" "+option2+" "+option3);
			// store users answer 
			Scanner input = new Scanner(System.in);
			 String usersAnswer = input.next();
			// display wether correct anser or not 
			if(usersAnswer.equals(correctAnswer)) {
				System.out.println("\n Congratulations your answer is right..");
				doYouWantToContinue=false;
			}else {
				System.out.println("sorry wrong answer...");
				System.out.println("\n do you want to give it try again? if so type yes..?");
				 String choice = input.next();
				if(choice.equalsIgnoreCase("yes")) 
					doYouWantToContinue=true;
				
			}
			
		}

	}

}
