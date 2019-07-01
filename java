public class E18_ArrayCalc {

public static void main(String[] args) {
		
		// creating an array to practice on
		double[] array1 = {2.1,3.6,5,9.2,4.1,7,2.6,4.8,9.7,7.8,4.1,52.3,45.7,12.1,63.1,99.4,0.2,0.75,89.3};
		printArray( array1);
		System.out.println(); //creating space between each method print out.
		findSumAndAvg( array1);
	}
	/* make sure the argument double[] array1 is inside the parenthesis of the method.
	 *  To avoid IndexOutOfBounds Exception in the for loop, do not put <=array1.length just <array1.length.
	 *  Adding (i+1) in the print statement will give you the index number holding each element.
	 */
	public static void printArray(double [] array1) {
		for(int i = 0; i < array1.length; i++) {
			System.out.println(" Index number: "+(i+1)+" holds the element: "+array1[i]);
		}
	}
	/* This method is 
	 * This is my first time using a  "for-each" loop
	 * make sure to locate the System.out.println outside the method body.
	 * in the "printf" statement make sure to put  a ',' instead of a '+' when using "%.2f" to keep only 2 integer after the decimal point.
	 */
	
		public static void findSumAndAvg(double [] array1){
			
			double sum = 0;
			double avg = 0;
			for(double value : array1) {
			sum += value;
			avg = sum / array1.length;
			}
			
			// Print out of result.
			System.out.println(" Adding all the elements of array1 together will add up to: "+sum);	
			System.out.printf(" Adding all the elements of array1 together and dividing by the number of elements will average to: %.2f",avg);	
			}
}
