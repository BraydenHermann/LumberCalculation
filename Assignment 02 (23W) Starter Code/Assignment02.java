import java.util.Scanner;

/*
 * Student Name: Brayden Hermann
 * Lab Professor: Fedor Ilitchev
 * Due Date: 3/31/2023
 * Modified: 3/30/2023
 * Description: Assignment 2 - Main Program
 */

/*
 * Class for Assignment 2's main program
 */
public class Assignment02 {

	/*
	 * Main method
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DimensionalLumber lumber = new DimensionalLumber();
		LumberChecker lumberChecker = new LumberChecker();
		User user = new User();
		String answer = "Yes"; // set the answer to yes by default so the user is prompted to enter dimensions
		
		// display the expected dimensions for lumber
		System.out.println(String.format("Please enter the measured lumber dimensions"
				+ "\nExpected values (inches):\nThickness: %.5f, Width: %.5f, Length: %.5f", 
				lumber.EXPECTED_THICKNESS, lumber.EXPECTED_WIDTH, lumber.EXPECTED_LENGTH));
		
		//while the string is yes, prompt the user to enter lumber dimensions
		while(answer.toUpperCase().contains("Y")) {
			
			// set the lumber's thickness
			lumber.setThickness(user.inputDouble("\nEnter measured thickness (inches): "));
			
			// set the lumber's width
			lumber.setWidth(user.inputDouble("Enter measured width (inches): "));
			
			// set the lumber's length
			lumber.setLength(user.inputDouble("Enter measured length (inches): "));
			
			// display the lumber's dimensions
			System.out.print(lumber.toString());
			
			// display any issues with the lumber's dimensions
			System.out.print(lumberChecker.validate(lumber));
			
			// ask the user if they want to re-enter the lumber's dimensions
			answer = user.inputString("\n\nWould you like to enter more data? ");
		}

		System.out.println("Program modified by Brayden Hermann");
	}
}