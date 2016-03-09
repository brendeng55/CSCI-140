import java.util.Scanner;

/**
 * This program prompts the user to enter an integer, if an integer is
 * not entered the program throws an exception.
 * @author Brenden
 *
 */
public class Lab33 {

	/**
	 * Entry point into the program
	 * @param args command line args
	 */
	public static void main(String[] args)
	{
		
		try{
		int x = getInt();
		System.out.println(x);
		}catch(IllegalArgumentException e){
			System.err.println(e.getMessage());
		}

	}
	
/**
 * Determine if the number entered is an integer, if so return it.
 * @return integer entered by user
 */
	public static int getInt()

	{

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please enter an integer: ");
			
			if(!scanner.hasNextInt()){
			throw new IllegalArgumentException("You did not enter an integer! I can never trust you.");
			}
			
			int number = scanner.nextInt();
			
			return number;
			
		}
}
		

	


