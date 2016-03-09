/**
 * This program takes the string "abcdefg" and reverses it using a recursive method.
 * @author Brenden
 *
 */
public class Lab22 {

	/**
	 * Starting point for program
	 * @param args command line args
	 */
	public static void main(String[] args)
	{
		
	String word = "abcdefg";
	System.out.println("Word: " + word );
	System.out.println("Word reversed: " + reverse(word));
	}

	/**
	 * This recursive method reverses the string "abcdefg" 
	 * @param word original string value
	 * @return reverse string
	 */
	private static String reverse(String word) {
		
		if (word.length() == 1) {
			return word;	
	}
		return reverse(word.substring(1)) + word.charAt(0);
	}

}