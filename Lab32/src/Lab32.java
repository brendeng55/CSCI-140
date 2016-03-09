import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program reads in two files and determines if the "file" contains any spelling errors based on the 
 * provided dictionary file.
 * @author Brenden
 *
 */
public class Lab32 {
	
	/**
	 * Displays correct format for command line args
	 */
	public static void usage(){
		System.out.println("Usage: java Lab32 dictionary file1 \n dictionary: The dictionary file."
				+ "\n file1: The file you wish to test for spelling errors.");
		System.exit(1);
	}

	/**
	 * Entry point into program
	 * @param args command line args
	 * @throws FileNotFoundException throws exception if file not found
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		if(args.length != 2){
			usage();
		}
		
		String inFile = "";
		String inFileTwo = "";
		
		
		inFile = args[0];
		inFileTwo = args[1];

		
		
		File words = new File(inFile);
		Scanner in = new Scanner(words);
		
		File mary = new File(inFileTwo);
		Scanner inTwo = new Scanner(mary);
		inTwo.useDelimiter("[^A-Za-z]+");

		ArrayList<String> wordList = new ArrayList<String>();
		ArrayList<String> maryFile = new ArrayList<String>();

		for (int i = 0; i <= wordList.size(); i++) {
			if (in.hasNext()) {
				wordList.add(i, in.next());
			}
		}
		
		for(int j =0;j<=maryFile.size();j++){
			if (inTwo.hasNext()) {
				maryFile.add(j, inTwo.next());
			}
		}
		
		for(String maryElement : maryFile){
			if(!wordList.contains(maryElement) && !maryElement.equals("")){
				System.out.println(maryElement);
			}
		}
		
		
		in.close();
		inTwo.close();
	}
	
}
