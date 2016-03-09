import java.util.Scanner;

/**
 * The following algorithm yields the season (Spring, Summer, Fall, or Winter) for a given month and day.
 * @author Brenden
 *
 */

public class Lab8 {

	public static void main(String[] args) {
		
		//Create scanner object for user input
		Scanner scanner = new Scanner(System.in);
		
		//Initialize variables
		String season = null;
		int month = 0;
		int day = 0;
		
		//Prompt for and store values for month and day
		while(month <1 || month > 12 || day < 1 || day > 31){
		System.out.print("Please enter a numeric month (1-12):");
		month = scanner.nextInt();
		System.out.print("Please enter a numeric day (1-31):");
		day = scanner.nextInt();
		
			//Check to make sure user entered a valid input
			if(month <1 || month > 12 || day < 1 || day > 31){
				System.out.println("Please enter a valid input.");
			}
		}
		
			//Determine the month by what the user entered
			if(month == 1 || month == 2 || month == 3){
				season = "Winter";
			}
			else if(month == 4 || month == 5 || month == 6){
				season = "Spring";
			}
			else if(month == 7 || month == 8 || month == 9){
				season = "Summer";
			}
			else if(month == 10 || month == 11 || month == 12){
				season = "Fall";
			}
			
			/*
			 * Determine if the month is 3,6,9 or 12, if it is then check to see if day is greater than 21.
			 * If both statements are true than change to the correct season 
			 */
			if(month % 3 == 0 && day >=21){
				if(season == "Winter"){
					season = "Spring";
				}
				else if(season == "Spring"){
					season = "Summer";
				}
				else if(season == "Summer"){
					season = "Fall";
				}
				else {
					season = "Winter";
				}
				
			}
			
			//Output the corresponding season
			System.out.println("Season: " + season);
			
		//Close scanner to get rid of stupid warning notification
		scanner.close();
	}

}
