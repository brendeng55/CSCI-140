import java.util.Scanner;

/**
 * This program takes an integer entered by a user and adds the sum of all the numbers prior and up to it, then
 * displays the sum
 * @author Brenden
 */

public class Lab11 {

	public static void main(String[] args) {
		
		//Create new Scanner object for user input
		Scanner scanner = new Scanner(System.in);
		
		//Create user input 'n' variable and prime it to 0 
		int n = 0;
		
		//While the user does not enter '-1' run this code asking for user input
		while(n != -1){
			
			//Set sum equal 0 for each iteration of the loop
			int sum = 0;
			
			System.out.print("Please enter a number (-1 to quit):");
			n = scanner.nextInt();
			
			//If n is -1 then break from loop and terminate program	
			if(n == -1){
				break;
			}
				//Nested for loop to add up all numbers <= to the users input
				for(int i=0; i<=n; i++){
					sum += i;
				
				}
				//print sum and return to top of while loop
				System.out.println("Sum:" + sum);
				
			
		}
		
		
		//Close scanner to get rid of stupid warning
		scanner.close();
	}

}
