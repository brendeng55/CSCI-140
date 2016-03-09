import java.util.Arrays;

/**
 * This program rotates the elements in the array x[] to match a pre-determined number (3).
 * @author Brenden
 *
 */
public class Lab26 {
	
	/**
	 * Entry into program
	 * @param args command line args
	 */

	public static void main(String[] args)

	{

		//Array to be passed to function
		double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};

		System.out.println("Before rotation: ==============================");

		for (int i = 0; i < x.length; i++)

		{

			System.out.println("x[" + i + "]: " + x[i]);

		}

		x = rotate(x, 3);

		System.out.println("After rotation: ==============================");

		for (int i = 0; i < x.length; i++)

		{

			System.out.println("x[" + i + "]: " + x[i]);

		}

	}

	/**
	 * This method rotates the array to begin with the predetermined value (3), and tacking 
	 * all elements before it to the end of the array.
	 * @param x hard-coded double array declared in main
	 * @param i integer to determine start of rotated array
	 * @return y the new rotated array
	 */
	private static double[] rotate(double[] x, int i) {
		
		//Keep track of index
		int y_index = 0;
		
		//Create copy of array and make rotation
		double y[] = Arrays.copyOf(x, x.length);
		for(int z = i;z<=x.length-1;z++){
			y[y_index] = x[z];
			y_index++;
		}
		
		for(int z = 0; z<i; z++){
			y[y_index] = x[z];
			y_index++;
		}
		
		return y;
	}

}
