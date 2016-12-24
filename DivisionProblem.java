import java.util.Random;

class DivisionProblem {

	int dividend, divisor, quotient;
	static int answered=0, answeredRight=0;
	
	void generate() {
    	Random myRandom = new Random();
    	divisor = myRandom.nextInt(10) + 5;
    	quotient = myRandom.nextInt(10) + 2;
    	dividend=divisor*quotient;
	}
	void stateProblem() {
	    System.out.print("What is " + dividend + " divided by " + quotient + "?");
	}
	boolean checkAnswerTF(int answer) {
		return answer == divisor;
	}
	void rightAnswer() {
		++answered;
	    ++answeredRight;
    	System.out.println("That's right!");
	}
	void wrongAnswer() {
		++answered;
    	System.out.println("No, the answer is "+ divisor);	    	
	}
	void statePerformance() {
	    System.out.print("You have answered " + answeredRight + " of " + answered + " questions correctly. ");
	}
}
