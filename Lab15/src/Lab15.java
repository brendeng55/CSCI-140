/**
 * This program prints out 2 columns of numbers using nested loops with the for, while and
 * do-while loop
 * 
 * @author Brenden
 *
 */

public class Lab15 {

	public static void main(String[] args) {

		// For loop
		System.out.println("For --------------");
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%d \t %d \n", i, j);
			}
		}

		// While loop
		System.out.println("While ------------");
		int k = 1; // Counting variable for outer while loop
		while (k <= 2) {
			int l = 1; // Counting variable for inner while loop
			while (l <= 4) {
				System.out.printf("%d \t %d \n", k, l);
				l++;

			}
			k++;
		}
		// Do while loop
		System.out.println("Do-While ---------");
		int x = 1; // Counting variable for outer do-while loop
		do {
			int z = 1; // Counting variable for inner do-while loop
			do {
				System.out.printf("%d \t %d \n", x, z);
				z++;
			} while (z <= 4);
			x++;
		} while (x <= 2);
	}
}
