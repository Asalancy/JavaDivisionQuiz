import java.util.Random;
import java.util.Scanner;

public class DivisionQuiz {

	public static void main(String[] args) {
		
	    char reply;
		Scanner keyboard = new Scanner(System.in);
		DivisionProblem aDivisionProblem;
		
		do {
			aDivisionProblem = new DivisionProblem();			
			aDivisionProblem.generate();
			aDivisionProblem.stateProblem();
			if (aDivisionProblem.checkAnswerTF(keyboard.nextInt())) {
		    	aDivisionProblem.rightAnswer();
			}	else	{
		    	aDivisionProblem.wrongAnswer();
			};
			aDivisionProblem.statePerformance();
			
	    	System.out.println("Another problem? Type Y for yes.");
		    reply = keyboard.findWithinHorizon(".", 0).charAt(0);
		    
		} while (reply == 'Y'||reply == 'y');		
	    keyboard.close();
	}
}
