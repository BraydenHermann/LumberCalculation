/*
 * Student Name: Brayden Hermann
 * Lab Professor: Fedor Ilitchev
 * Due Date: 3/31/2023
 * Modified: 3/30/2023
 * Description: Assignment 2 - Lumber Checker
 */

/*
 * Class to check if a lumber's dimensions meet specifications
 */
public class LumberChecker {
	// create static variable to check dimensions
	public static final double EPSILON = 0.03125;
	
	/*
	 * Check if the lumber's dimensions meet specifications
	 */
	public String validate(DimensionalLumber lumber) {
		
		// set private variables to the lumber's dimensions
		double thickness = lumber.getThickness();
		double width = lumber.getWidth();
		double length = lumber.getLength();
		
		String report = "";
			
		// variables to check how far the dimensions exceed tolerance
		double minThickness = lumber.EXPECTED_THICKNESS - EPSILON; // low range
		double maxThickness = lumber.EXPECTED_THICKNESS + EPSILON; // high range
		
		double minWidth = lumber.EXPECTED_WIDTH - EPSILON; // low range
		double maxWidth = lumber.EXPECTED_WIDTH + EPSILON; // high range
		
		double minLength = lumber.EXPECTED_LENGTH - EPSILON; // low range
		double maxLength = lumber.EXPECTED_LENGTH + EPSILON; // high range
		
		// check if the thickness exceeds tolerance
		if (thickness < minThickness) { // if the thickness is too low
			if (thickness < 1) { // if the thickness is invalid
				report += "\nThickness cannot be 0 or negative.";
			}
			else {
				report += String.format("\nThickness exceeds tolerance by %.5f inches.", 
						minThickness - thickness);
			}
		}
		else if (thickness > maxThickness) { // if the thickness is too high
			report += String.format("\nThickness exceeds tolerance by %.5f inches.", 
					thickness - maxThickness);
		}
		
		// check if the width exceeds tolerance
		if (width < minWidth) { // if the width is too low
			if (width < 1) { // if the width is invalid
				report += "\nWidth cannot be 0 or negative.";
			}
			else {
				report += String.format("\nWidth exceeds tolerance by %.5f inches.", 
						minWidth - width);
			}
		}
		else if (width > maxWidth) { // if the width is too high
			report += String.format("\nWidth exceeds tolerance by %.5f inches.", 
					width - maxWidth);
		}
		
		// check if the length exceeds tolerance
		if (length < minLength) { // if the length is too low
			if (length < 1) { // if the length is invalid
				report += "\nLength cannot be 0 or negative.";
			}
			else {
				report += String.format("\nLength exceeds tolerance by %.5f inches.", 
						minLength - length);
			}
		}
		else if (length > maxLength) { // if the width is too high
			report += String.format("\nLength exceeds tolerance by %.5f inches.", 
					length - maxLength);
		}
		
		return report;
	}
}
