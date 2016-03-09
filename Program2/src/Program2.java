import java.util.Scanner;

/**
 * This program checks the validity of an 8 digit credit card number by checking
 * the sums of the even numbers added to the sums of the odd numbers. If the
 * total sum is a mod of 10 then the number is valid, if not it tells you what
 * the correct check digit should be.
 * 
 * @author Brenden
 *
 */

public class Program2 {

	public static void main(String[] args) {

		// Create new scanner object for user input
		Scanner scanner = new Scanner(System.in);
		String creditCardNum;

		// Prompt for and store credit card number as a string
		System.out.print("Please enter 8-digit credit card number:");
		creditCardNum = scanner.next();

		// Parse each digit into an integer
		int digit1 = Integer.parseInt(creditCardNum.substring(0, 1));
		int digit2 = Integer.parseInt(creditCardNum.substring(1, 2));
		int digit3 = Integer.parseInt(creditCardNum.substring(2, 3));
		int digit4 = Integer.parseInt(creditCardNum.substring(3, 4));
		int digit5 = Integer.parseInt(creditCardNum.substring(4, 5));
		int digit6 = Integer.parseInt(creditCardNum.substring(5, 6));
		int digit7 = Integer.parseInt(creditCardNum.substring(6, 7));
		int digit8 = Integer.parseInt(creditCardNum.substring(7, 8));

		// Calculate firstSum by adding all even digits
		int firstSum = digit8 + digit6 + digit4 + digit2;

		// Breakdown odd digits to check if the doubled version is > 10, if so
		// add the 2 numbers together

		// Digit 7 breakdown
		int digit7Sum;
		if (digit7 * 2 == 18) {
			digit7Sum = 9;
		} else if (digit7 * 2 == 16) {
			digit7Sum = 7;
		} else if (digit7 * 2 == 14) {
			digit7Sum = 5;
		} else if (digit7 * 2 == 12) {
			digit7Sum = 3;
		} else if (digit7 * 2 == 10) {
			digit7Sum = 1;
		} else {
			digit7Sum = digit7 * 2;
		}

		// Digit 5 breakdown
		int digit5Sum;
		if (digit5 * 2 == 18) {
			digit5Sum = 9;
		} else if (digit5 * 2 == 16) {
			digit5Sum = 7;
		} else if (digit5 * 2 == 14) {
			digit5Sum = 5;
		} else if (digit5 * 2 == 12) {
			digit5Sum = 3;
		} else if (digit5 * 2 == 10) {
			digit5Sum = 1;
		} else {
			digit5Sum = digit5 * 2;
		}

		// Digit 3 breakdown
		int digit3Sum;
		if (digit3 * 2 == 18) {
			digit3Sum = 9;
		} else if (digit3 * 2 == 16) {
			digit3Sum = 7;
		} else if (digit3 * 2 == 14) {
			digit3Sum = 5;
		} else if (digit3 * 2 == 12) {
			digit3Sum = 3;
		} else if (digit3 * 2 == 10) {
			digit3Sum = 1;
		} else {
			digit3Sum = digit3 * 2;
		}

		// Digit 1 breakdown
		int digit1Sum;
		if (digit1 * 2 == 18) {
			digit1Sum = 9;
		} else if (digit1 * 2 == 16) {
			digit1Sum = 7;
		} else if (digit1 * 2 == 14) {
			digit1Sum = 5;
		} else if (digit1 * 2 == 12) {
			digit1Sum = 3;
		} else if (digit1 * 2 == 10) {
			digit1Sum = 1;
		} else {
			digit1Sum = digit1 * 2;
		}

		// SecondSum is equal to the sums of the odd digits added together
		int secondSum = digit7Sum + digit5Sum + digit3Sum + digit1Sum;
		int totalSum = firstSum + secondSum;

		// Determine if totalSum mod 10 = 0, if so the number is valid.
		// If not, get the
		// absolute value of the 8th digit minus the totalSum mod 10 remainder
		if (totalSum % 10 == 0) {
			System.out.println("Valid!");
		}
		// If not multiple of 10, print invalid and reset check digit to 0
		if (totalSum % 10 != 0) {
			System.out.println("Invalid!");
			digit8 = 0;

			// While not multiple of 10, recalculate sums with new check digit
			// until it is a multiple of 10
			while (totalSum % 10 != 0) {
				firstSum = digit8 + digit6 + digit4 + digit2;
				totalSum = firstSum + secondSum;
				digit8++;
			}
			// Print check digit that will make the number valid
			System.out.println("Check digit should be: " + (digit8 - 1));
		}

		// Close scanner for good practice
		scanner.close();
	}

}
