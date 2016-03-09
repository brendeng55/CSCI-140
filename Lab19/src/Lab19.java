
import java.util.Scanner;

/**
 * This program takes 2 inputs (length and width) and calculates the area of a
 * rectangle.
 * 
 * @author Brenden
 *
 */

public class Lab19 {
	
	/**
	 * Entry point for the program
	 * @param args command line arguments 
	 */

	public static void main(String[] args) {

		// New scanner object created for input
		Scanner scanner = new Scanner(System.in);

		// Create variables
		String playAgain = "y";
		float width = 0;
		float length = 0;

		// Continue to run loop until user enters "n" to quit
		while (playAgain.equalsIgnoreCase("y")) {

			// Get 2 floating point number inputs
			System.out.print("Please enter a length:");
			length = scanner.nextFloat();
			System.out.print("Please enter a width:");
			width = scanner.nextFloat();

			// Call areaOfRectangle function and pass it length and width
			double area = areaOfRectangle(length, width);

			// Print results
			System.out.printf("Area: %.1f \n", area);

			// Keep prompting if the user wants to play again until they enter
			// "y" or "n"
			do {
				System.out.print("Enter more? (Y/N)?");
				playAgain = scanner.next();

			} while (!playAgain.equalsIgnoreCase("y")
					&& !playAgain.equalsIgnoreCase("n"));

			// Print new line to separate new calculation from old
			System.out.println("");
		}

		// Close scanner for good practice
		scanner.close();

	}

	/**
	 * This method computes the area of a rectangle
	 * @param length, the length of a rectangle
	 * @param width, the width of a rectangle 
	 * @return area of rectangle
	 */
	public static double areaOfRectangle(float length, float width) {
		double area = length * width;
		return area;
	}

}

