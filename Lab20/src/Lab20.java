import java.util.Scanner;

/**
 * This program accepts an integer (n) and then prints out a triangle of "*" with (n) rows.
 * @author Brenden
 *
 */

public class Lab20 {
	
	/**
	 * Main method
	 * @param args, command line args
	 */
	
	public static void main(String[] args) {
		
		//New scanner object created for user input
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user for integer and store it in 'n'
		System.out.print("Please enter a number: ");
		int n = scanner.nextInt();
		
		
		//Call printUpTriangle method
		printUpTriangle(n, "*");
		
		//Close scanner for good practice
		scanner.close();
	}
	
	/**
	 * This method creates a string with 'n' # of *'s 
	 * @param n, integer value will determine bottom row of *'s
	 * @param s, string concatenated to match n number of *'s
	 * @return string s to be passed into printUpTriangle 
	 */
	public static String makeRow(int n, String s){
		String ret = "";
		for(int i=1; i<=n; i++){
			ret += "*"; 
		}
		return ret;
	}
		
	/**
	 * Printing a left triangle with a base of s printed n times
	 * @param n, integer value to determine bottom row of *'s
	 * @param s, the string that makes up the triangle
	 */
	public static void printUpTriangle(int n, String s){
			
			for(int i=1;i<=n;i++){
				//Call/print makeRow method and pass it i and s
				System.out.println(makeRow(i, s));
			}
		
	}
}

