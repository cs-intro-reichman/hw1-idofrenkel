// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Example command line:
		// java Bill3 Ron Lisa Dan 100
		// result : args = ["Ron", "Lisa", "Dan", "100"]
		// To get you started, here is the first line in the program:
		
	    String name1 = args[2];
		String name2 = args[1];
		String name3 = args[0];
		String stringNumber = args[3];
		double shekelsEach = Integer.parseInt(stringNumber) / 3.0;
		shekelsEach = Math.ceil(shekelsEach);
	//  double shekelsEach = 100 / 3.0;

		System.out.println("Dear " + name1 + ", " + name2 + ", and " + name3 + ": pay " + shekelsEach + " Shekels each.");
	    // "Dear Ran, Lisa, and Dan: pay 34.0 Shekels each."
		// Replace this comment with the rest of your code   
	}
}
