/**
 * Using arrays in Java
 * @author Brenden
 *
 */
public class Lab24 {

	/**
	 * Entry point into program
	 * @param args command line args
	 */
	public static void main(String[] args) {

		//Initialize an array of type double and give it values
		double x[] = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };

		System.out.println("Length: " + x.length); //Print length
		System.out.println("X[0]: " + x[0]); //Print value stored in x[0]
		System.out.println("x[8]: " + x[8]); // Same value as x.length -1
		System.out.println("X[lastIndex]: " + (x[x.length - 1])); // Same as x[8]

		System.out.println();
		
		//Print values 0-8 without x[]
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

		System.out.println();

		//Print "x[0]-x[8]" with corresponding values
		int j = 0;
		while (j < x.length) {
			System.out.printf("x[%d]:%.2f \n", j, x[j]);
			j++;
		}

		System.out.println("");

		//Print "x[8]-x[0]" with corresponding values
		for (int k = 8; k >= 0; k--) {
			System.out.printf("x[%d]:%.2f \n", k, x[k]);
		}

	}
}
