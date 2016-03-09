import java.util.Random;
import java.util.Scanner;

/**
 * This program simulates drawing a random card from a standard deck of
 * cards.
 * 
 * @author Brenden
 *
 */
public class Lab17 {

	public static void main(String[] args) {

		//New random and scanner objects created
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		//Create strings to hold outputs
		String suitDisplay = "";
		String suit = "";
		
		//Sentinel string
		String playAgain = "y";
		

		//Continue to run loop until user enters "n" to quit
		while (playAgain.equalsIgnoreCase("y")) {
			
			//Initialize random number for card value (1-9 AND ace/jack/queen/king)
			int value = random.nextInt(13) + 1;
			//Initialize random number for the different suits (Spades/Hearts,Clubs/Diamonds)
			int suitGroup = random.nextInt(4) + 1;

			//Set suitDisplay equal to its corresponding value
			if (suitGroup == 1) {
				suitDisplay = "Spades";
			} else if (suitGroup == 2) {
				suitDisplay = "Hearts";
			} else if (suitGroup == 3) {
				suitDisplay = "Clubs";
			} else {
				suitDisplay = "Diamonds";
			}

			//If card value is above 9 then assign the string suit to its corresponding value
			if (value > 9) {
				if (value == 10) {
					suit = "Ace";
				} else if (value == 11) {
					suit = "Jack";
				} else if (value == 12) {
					suit = "Queen";
				} else {
					suit = "King";
				}
				System.out.printf("%s of %s \n", suit, suitDisplay); // If original value was greater than 9 print this line with string value
			} else {
				System.out.printf("%d of %s \n", value, suitDisplay); // Else print this one containing the random #1-9 decimal value
			}
			
			//Keep prompting if the user wants to play again until they enter "y" or "n"
			do {
				System.out.print("Would you like to draw again (Y/N)?");
				playAgain = scanner.nextLine();
				
			} while (!playAgain.equalsIgnoreCase("y")
					&& !playAgain.equalsIgnoreCase("n"));
			
			//Print new line to separate new draw from old
			System.out.println("");
		}

		//Close scanner for good practice
		scanner.close();

	}
}
