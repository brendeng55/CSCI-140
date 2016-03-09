import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program uses the different built in ArrayList methods to create, edit and display ArrayLists.
 * @author Brenden
 *
 */
public class Lab28 {

	/**
	 * Entry point into program	
	 * @param args command line args
	 */
	public static void main(String[] args) {

		//Create ArrayList and scanner for input
		ArrayList<String> names = new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Empy list: " + names);
		
		//For loop to enter names
		System.out.print("Enter names: ");
		for(int i=0;i<8;i++){
			names.add(i, scanner.next());
		}
		
		
		//Print list
		System.out.println("List: " + names);
		
		//Print first and last name in the list 
		System.out.printf("First name: %s \n Last name: %s", names.get(0), names.get(7));
		System.out.println();
		
		//Print array size
		System.out.printf("Array Size = %s", names.size());
		
		System.out.println();
		
		//Print last name using name.size
		System.out.printf("Last name using size method: %s", names.subList(names.size() -1, names.size()));
		
		System.out.println();
		
		//Add in "Alice B. Toklas" to list
		names.set(0, "Alice B. Toklas");
		
		System.out.println("Add middle initial and last name for Alice: " + names);
		
		//Add in Doug at index 4
		names.add(4, "Doug");
		
		System.out.println("Add Doug in after David: " + names);
		System.out.println();
		for(String str : names){
			System.out.println(str);
		}
		System.out.println();
		
		ArrayList<String> names2 = new ArrayList<String>(names);
		
		//Remove first index
		names.remove(0);
		
		System.out.println("Deleted first element: " + names);
		System.out.println("Names2 not edited: " + names2);
	}

	
}
