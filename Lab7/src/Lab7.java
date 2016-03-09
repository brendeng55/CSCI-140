import java.util.Scanner;

/**
 * This program takes a letter grade input and outputs the corresponding grade point value. If a - or + is added
 * to the letter grade, the point value is adjusted accordingly.
 * @author Brenden
 *
 */

public class Lab7 {

	public static void main(String[] args) {
		
		//Create new Scanner object for getting input
		Scanner scanner = new Scanner(System.in);
		
		//Declare Variables 
		double value = 4.0;
		double inc = .3;
		
		//Prompt, call toLowerCase function and store input
		System.out.print("Enter a letter grade:");
		String letterGrade = scanner.nextLine();
		letterGrade = letterGrade.toLowerCase();
		
		//Assigning a grade point value to the corresponding letter grade
		if(letterGrade.equals("a")){
			value = 4.0;
		}

		else if(letterGrade.equals("a+")){
			value = 4.0;
		}
		else if(letterGrade.equals("a-")){
			value = 4.0 - inc;
		}
		else if(letterGrade.equals("b")){
			value = 3.0;
		}

		else if(letterGrade.equals("b+")){
			value = 3.0 + inc;
		}
		else if(letterGrade.equals("b-")){
			value = 3.0 - inc;
		}
		else if(letterGrade.equals("c")){
			value = 2.0;
		}

		else if(letterGrade.equals("c+")){
			value = 2.0 + inc;
		}
		else if(letterGrade.equals("c-")){
			value = 2.0 - inc;
		}
		else if(letterGrade.equals("d")){
			value = 1.0;
		}

		else if(letterGrade.equals("d+")){
			value = 1.0 + inc;
		}
		else if(letterGrade.equals("d-")){
			value = 1.0 - inc;
		}
		else if(letterGrade.equals("f")){
			value = 0.0;
		}
		else if(letterGrade.equals("f+")){
			value = 0.0;
		}
		else if(letterGrade.equals("f-")){
			value = 0.0;
		}
		else {
			value = -1.0;
		}
		
		
		//Output the corresponding grade point value
		if(value == -1.0){
			System.out.println("You did not enter a correct letter grade.");
		}
		else {
			System.out.println("The numeric value is " + value);	
		}
		
		//Close scanner
		scanner.close();
	}

}
