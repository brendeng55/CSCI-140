import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 * This program creates a file and stores memos entered by the user. 
 * @author Brenden
 *
 */
public class Lab30 {

	/**
	 * Entry point into program
	 * @param args command line args
	 * @throws FileNotFoundException when file can not be created
	 */
	public static void main(String[] args) throws FileNotFoundException

	{

		Date now = new Date();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Output file: ");
		String filename = scanner.nextLine();

		PrintWriter out = new PrintWriter(filename);
		boolean done = false;

		while (!done)

		{

			System.out.println("Memo topic (enter -1 to end):");

			String topic = scanner.nextLine();

			if (topic.equals("-1"))

			{

				done = true;

			}

			else

			{

				System.out.println("Memo text:");

				String message = scanner.nextLine();

				// Create the new date object and obtain a dateStamp
				String dateStamp = now.toString();

				out.println(topic + "\n" + dateStamp + "\n" + message);

			}

		}

		// Close the output file
		out.close();
		scanner.close();
	}

}
