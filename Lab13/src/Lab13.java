import java.util.Scanner;

/**
 * This program accepts numerous integers until the user decides to quit. Once the user quits, the total number
 * of numbers entered is displayed, and then the total number of positive, 0, and negative integers is displayed.
 * @author Brenden
 *
 */

public class Lab13 {
	
	public static void main(String[] args) {
		
		//Create new scanner object for user input
		Scanner scanner = new Scanner(System.in);
		
		//Create variables 
		String num = "";
		int positive = 0;
		int negative = 0;
		int zero = 0;
		int count = 0;
		int quit = 0; //Prime quit to 0 to enter loop
		
		//While quit = 0, keep the loop a rolling
		while(quit == 0){
			System.out.print("Number (q to quit):");
			
			//num is first stored as a string by using the nextLine() function
			num = scanner.nextLine();
			
			//If the user enters "q" then change quit value to 1 and break from loop
			if(num.equals("q")){
				quit = 1;
				break;			
				}
			
			//Add 1 to count each time loop is accessed 
			count++;
			
			//Parse the num string into an integer and check to see if it is > 0, if so Add 1 to positive
			if(Integer.parseInt(num) > 0){
				positive++;
			}
			
			//Parse the num string into an integer and check to see if it is 0, if so Add 1 to zero
			else if(Integer.parseInt(num) == 0){
				zero++;
			}
			
			//The last option means its negative, therefore add 1 to negative
			else {
				negative++;
			}
			
			
		}
		
		//Print the results
		System.out.printf("Count: %d \n", count);
		System.out.printf("%-10s%-10s%-10s \n %-10d%-10d%-10d", "Positive", "Zero", "Negative", positive, zero, negative);

		//Close scanner to get rid of nasty warning
		scanner.close();
	}
}