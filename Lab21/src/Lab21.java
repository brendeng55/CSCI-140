import java.util.Scanner;

/**
 * This program accepts a byte value (0-15) from the user, and returns the hex
 * value (0-F).
 * 
 * @author Brenden
 *
 */

public class Lab21 {

	/**
	 * Main method for program
	 * 
	 * @param args command line args
	 *            
	 */

	public static void main(String[] args) {

		// Create scanner object and byte value
		Scanner scanner = new Scanner(System.in);
		byte value = 0;

		// repeat this until user enters a value 0-15
		do {
			System.out.print("Please enter an integer value from 0-15:");
			value = scanner.nextByte();
		} while ((value < 0) || (value > 15));

		// Call bitsToHex method and print the results
		System.out.println("Hex: " + bitsToHex(value));

		// Close scanner for good practice
		scanner.close();
	}

	/**
	 * This method accepts a byte value and returns the equivalent hex value
	 * 
	 * @param a byte value entered by user
	 * @return hexValue that corresponds with byte value
	 */

	private static String bitsToHex(byte a) {

		String hexValue = "";
		
		//Determine hexValue to return
		if(a <=9 ){
			hexValue = String.valueOf(a);
			return hexValue;
		}
		
		//Switch case for byte values greater than 9
		switch (a) {
		case 10:
			hexValue = "A";
			break;
		case 11:
			hexValue = "B";
			break;
		case 12:
			hexValue = "C";
			break;
		case 13:
			hexValue = "D";
			break;
		case 14:
			hexValue = "E";
			break;
		default:
			hexValue = "F";
			break;

		}
		return hexValue;
	}
}

