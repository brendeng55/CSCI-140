import java.util.Scanner;

/**
 * This program converts certain measurements to other compatible desired measurements.
 * @author Brenden
 *
 */


public class Program1 {

	public static void main(String[] args) {
		
		//New Scanner object created
		Scanner scanner = new Scanner(System.in);
		double answer = 0;
		
		final double OUNCE_TO_GRAM = 28.349;
		final double OUNCE_TO_KILOGRAM = 0.0283495;
		final double POUND_TO_GRAM = 453.592;
		final double POUND_TO_KILOGRAM = 0.453592;
		final double INCHES_TO_MILLIMETER = 25.4;
		final double INCHES_TO_CENTIMETER = 2.54;
		final double INCHES_TO_METER = 0.0254;
		final double FEET_TO_MILLIMETER = 304.8;
		final double FEET_TO_CENTIMETER = 30.48;
		final double FEET_TO_METER = 0.3048;
		boolean wrongInput = false;
		
		//Convert from input
		System.out.print("Convert from? (oz,lb,in,ft)");
		String convertFrom = scanner.nextLine();
		convertFrom = convertFrom.toLowerCase();
		
		//Convert to input
		System.out.print("Convert to? (g,kg,mm,cm,m)");
		String convertTo = scanner.nextLine();
		convertTo = convertTo.toLowerCase();
		
		//Value input
		System.out.print("Value?");
		double value = scanner.nextDouble();
		
		//OZ to GRAM			
		if(convertFrom.equals("oz") && convertTo.equals("g")){
			//1 oz = 28.349 g
			answer = value * OUNCE_TO_GRAM;
		}
			
		//OZ to KG conversion 
			else if(convertFrom.equals("oz") && convertTo.equals("kg")){
			//1 oz = 0.0283495 kg
			answer = value * OUNCE_TO_KILOGRAM;
		}
		
		//LB to GRAM
			else if(convertFrom.equals("lb") && convertTo.equals("g")){
			//1 lb = 453.592g
			answer = value * POUND_TO_GRAM;
		}
		//LB to KG
			else if(convertFrom.equals("lb") && convertTo.equals("kg")){
				//1 lb = 0.453592kg
				answer = value * POUND_TO_KILOGRAM;
			}
		//Inches to MilliMeters
			else if(convertFrom.equals("in") && convertTo.equals("mm")){
				//1 inch = 25.4m
				answer = value * INCHES_TO_MILLIMETER;
			}
		//Inches to Centimeters
			else if(convertFrom.equals("in") && convertTo.equals("cm")){
				//1 inch = 2.54cm
				answer = value * INCHES_TO_CENTIMETER;
			}
		//Inches to Meters
			else if(convertFrom.equals("in") && convertTo.equals("m")){
				//1 inch = 0.0254m
				answer = value * INCHES_TO_METER;
			}
			
		//Feet to Millimeters
			else if(convertFrom.equals("ft") && convertTo.equals("mm")){
				//1 Foot = 304.8mm
				answer = value * FEET_TO_MILLIMETER;
			}
		//Feet to Centimeters
			else if(convertFrom.equals("ft") && convertTo.equals("cm")){
				//1 Foot = 30.48cm
				answer = value * FEET_TO_CENTIMETER;
			}
		//Feet to Meters
			else if(convertFrom.equals("ft") && convertTo.equals("m")){
				//1 Foot = .3048m
				answer = value * FEET_TO_METER;
			}
			//Input verification using boolean value
			else {
				wrongInput = true;
			}
		
		//If invalid conversion possibility, print else statement, otherwise print the conversion 
		if(wrongInput != true){
			System.out.println(value + " " + convertFrom + " = " + answer + " " +convertTo);
		}
		else {
			System.out.println("You can't convert that bro.");
		}
		
		//Close scanner
		scanner.close();
		}

	}

