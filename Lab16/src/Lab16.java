import java.util.Scanner;

/**
 * This program simulates a game between 2 users by rolling 2 random numbers
 * each, then determining whose sum is higher and displaying the results.
 * 
 * @author Brenden
 *
 */

public class Lab16 {

	public static void main(String[] args) {

		// Create scanner object for user input
		Scanner scanner = new Scanner(System.in);

		// Sentinel value for game loop, primed to "y"
		String playAgain = "y";

		// Prompt and store user's names
		System.out.print("Please enter player 1's name: ");
		String userOne = scanner.nextLine();
		System.out.print("Please enter player 2's name: ");
		String userTwo = scanner.nextLine();

		// While the user enters "y" to play again, run this loop
		while (playAgain.equalsIgnoreCase("y")) {

			// Create, store and compute random numbers
			int userOneRollOne = (int) (Math.random() * 6) + 1;
			int userOneRollTwo = (int) (Math.random() * 6) + 1;
			int userTwoRollOne = (int) (Math.random() * 6) + 1;
			int userTwoRollTwo = (int) (Math.random() * 6) + 1;
			int userOneSum = userOneRollOne + userOneRollTwo;
			int userTwoSum = userTwoRollOne + userTwoRollTwo;
			System.out.println("");

			// Display results
			System.out.printf("%s rolled a %d and %d for a total of %d \n",
					userOne, userOneRollOne, userOneRollTwo, userOneSum);
			System.out.printf("%s rolled a %d and %d for a total of %d \n",
					userTwo, userTwoRollOne, userTwoRollTwo, userTwoSum);

			// Compute the winner or tie
			if (userOneSum > userTwoSum) {
				System.out.printf("%s won! \n\n", userOne);
			} else if (userTwoSum > userOneSum) {
				System.out.printf("%s won! \n\n", userTwo);
			} else {
				System.out.println("You guys tied! \n");
			}

			// do-while loop, user must enter Y or N to break out
			do {
				System.out.print("Would you like to play again? (Y/N)");
				playAgain = scanner.next();
			} while (!playAgain.equalsIgnoreCase("y")
					&& (!playAgain.equalsIgnoreCase("n")));
		}

		// Close scanner for good practice
		scanner.close();
	}
}