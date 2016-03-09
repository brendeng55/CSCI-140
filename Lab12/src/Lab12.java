import java.util.Scanner;

/**
 * This program takes an integer entered by a user and adds the sum of all lesser integers using the for loop, 
 * while loop, and do-while loop. It then prints the results.
 * @author Brenden
 */

public class Lab12 {

	public static void main(String[] args) {
		
		//Create new Scanner object for user input
		Scanner scanner = new Scanner(System.in);
		
		//Create user input variable 
		int n;
		
		//Create counter variables 
		int j = 0;
		int k = 0;
			
		//Create accumulate variables 
		int forSum = 0;
		int whileSum = 0;
		int doWhileSum = 0;
			
		//Prompt for number
		System.out.print("Please enter a number:");
		n = scanner.nextInt();
			
			//For loop to add up all numbers <= to the users input
			for(int i=0; i<=n; i++){
				forSum += i;
			}
			
			//While loop
			while(j<=n){
				whileSum += j;
				j++;
			}
			
			//Do-While loop	
			do{			
				doWhileSum += k;
				k++;
			} while(k<=n);
			
		
			
		//Print sums for each loop using left alignment with width of 10
		System.out.printf("%-10s%-10s%-10s \n %-10d%-10d%-10d", "For", "While", "Do-While", forSum, whileSum, doWhileSum);

		//Close scanner to get rid of stupid warning
		scanner.close();
	}

}
