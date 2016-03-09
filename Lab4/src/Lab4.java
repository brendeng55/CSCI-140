import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program uses the substring function to extract letters from a sentence and outputs those letters to match the term "Tempus fugit"
 * @author Brenden
 *
 */
public class Lab4 {

	public static void main(String[] args){
		
		ArrayList<Double> prices = new ArrayList<Double>();
		ArrayList<Boolean> isPet = new ArrayList<Boolean>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean sentinel = true;
		
		while(sentinel){
		for(int i=0;i<=prices.size();i++){
			System.out.print("Price (-1 to stop): ");
			double price = scanner.nextDouble();
			if(price != -1){
				prices.add(price);
			}else{
				sentinel = false;
				break;
			}
			System.out.print("Pet? (y/n):");
			String petOrNo = scanner.next();
			
			if(petOrNo.equalsIgnoreCase("y")){
				isPet.add(true);
			}else{
				isPet.add(false);
			}
			
		}
		}
		discount(prices, isPet);
	}

	private static void discount(ArrayList<Double> prices,
			ArrayList<Boolean> isPet) {
		int petCount = 0;
		int otherItem = 0;
		double discount = 0;
		double nonPetTotal = 0.0;
		
		for(Boolean pet : isPet){
			if(pet){
				petCount++;
			}else{
				otherItem++;
			}
		}
		if(petCount >= 1 && otherItem >= 5){
			
			for (int j=0;j<isPet.size();j++){
				if(!isPet.get(j)){
					nonPetTotal += prices.get(j);
				}
			}
		}
		double subTotal = nonPetTotal;
		System.out.println("Subtotal = " + subTotal);
	}
}
