import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This program reads a file containing memos (Topic/date/text) and displays them 1 memo at a time.
 * @author Brenden
 *
 */
public class Lab31 {
	
	/**
	 * Entry point into program
	 * @param args command line args
	 * @throws IOException if file not found
	 */
	public static void main(String[] args) throws IOException

	{

		Scanner console = new Scanner(System.in);

		System.out.print("Input file: ");

		String inputFileName = console.nextLine();

		File inFile = new File(inputFileName);

		Scanner in = new Scanner(inFile);

		boolean done = false;

		while (in.hasNextLine() && !done)

		{

			String topic = in.nextLine();

			String dateStamp = in.nextLine();

			String message = in.nextLine();

			System.out.println(topic + "\n" + dateStamp + "\n" + message);

			if (in.hasNextLine()) { // You should only ask to display the
											// next memo if

				// there are more memos in the file
				System.out.println("Do you want to read the next memo (y/n)?");

				String ans = console.nextLine();

				if (ans.equalsIgnoreCase("n"))

				{

					done = true;

				}
			}

		}
		in.close();
		console.close();
	}

}
