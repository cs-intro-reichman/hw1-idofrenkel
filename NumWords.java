// Prints a given number using a hundreds, tens, and units notation.
// exp input - % java NumWords 517
// exp output - 5 hundreds, 1 tens, and 7 ones.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String numWordString = args[0];
        int numWords = Integer.parseInt(numWordString); 
		int hundreds = numWords / 100; 
		int tens = (numWords - (hundreds * 100)) / 10; 
		int ones = numWords - ((hundreds * 100 + tens * 10));
		System.out.println( hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
