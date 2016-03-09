/**
 * Using arrays with the for and enhanced for loops
 * @author Brenden
 *
 */
public class Lab25 {
	
	/**
	 * Entry point for the program
	 * @param args command line args
	 */
	public static void main(String[] args){
		
		double x[] = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		
		double sum = 0.0;
		for(double s : x){
			 sum += s;
		}
		System.out.println("Enhanced for loop total: " + sum);
		
		double total = 0.0;
		for(int i=0;i<(x.length);i++){
			total += x[i];
			
		}
		System.out.println("For loop total: " + total);
		
		double min = 0.0;
		for(int k=0; k<(x.length - 1); k++){
			if(x[k]<x[k+1]){
				min = x[k];
			}
			
		}
		System.out.println("Min Value: " + min);
		
		double max = 0.0;
		for(int j=0; j<=(x.length - 1); j++){
			if(max<x[j]){
				max = x[j];
			}
	}
		System.out.println("Max Value: " + max);

}
}
