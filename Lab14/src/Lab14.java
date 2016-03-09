import java.util.Scanner;

/**
 * This program finds the GCD by taking 2 integers and subtracting the larger
 * one from the smaller one, until one of them = 0. The GCD is then set to the
 * number that does not = 0.
 * 
 * @author Brenden
 *
 */

public class Lab14 {

	public static void main(String[] args) {

		// New scanner object created for user input
		Scanner scanner = new Scanner(System.in);

		// Prompt for, assign and print out the first number (num1 will be a
		// copy of x for calculations)
		System.out.print("Please enter the first integer: ");
		int x = scanner.nextInt();
		int num1 = x;
		System.out.println("x = " + x);

		// Prompt for, assign and print out the second number (num2 will be a
		// copy of y for calculations)
		System.out.print("Please enter the second integer: ");
		int y = scanner.nextInt();
		int num2 = y;
		System.out.println("y = " + y);

		// Create and prime GCD variable to 0
		int gcd = 0;

		// While num1 and num2 is greater than 0, subtract the smaller number
		// from the larger one
		while (num1 > 0 && num2 > 0) {

			if (num1 >= num2) {
				num1 -= num2;
			}

			else {
				num2 -= num1;
			}

			// If num1 = 0 then set GCD to num2
			if (num1 == 0) {
				gcd = num2;
			}

			// If num2 = 0 then set GCD to num1
			if (num2 == 0) {
				gcd = num1;
			}

		}

		// Check to make sure numbers are both positive and print results
		if (x < 0 || y < 0) {
			System.out.println("Please enter 2 positive numbers.");
		} else {
			System.out.printf("GCD(%d,%d) = %d", x, y, gcd);
		}

		// Close scanner to get rid of stupid warning
		scanner.close();
	}
}
