import java.util.Scanner;


/**
 * This program takes in 4 numbers and compares them to each other, it then prints out if there are two pairs 
 * of numbers or not.
 * @author Brenden
 *
 */
public class Lab9 {

	public static void main(String[] args) {
		
		//Create new Scanner to get input
		Scanner input = new Scanner(System.in);
		
		//Create prompt and get input
		System.out.print("Please enter 4 integers:");
		double n1 = input.nextDouble();
	    double n2 = input.nextDouble();
	    double n3 = input.nextDouble();
	    double n4 = input.nextDouble();
	    
	    //Determine if there are 2 pairs
	    if ((n1 == n2 || n1 == n3 || n1 == n4) && (n2 == n3 || n2 == n4 || n3 == n4)) {
	    	
	      System.out.println("Two pairs");
	    } else {
	      System.out.println("Not two pairs");
	    }
	    //Close scanner so stupid warning goes away
	    input.close();
	}

}
