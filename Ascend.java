// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim); 
		int b = (int) (Math.random() * lim); 
		int c = (int) (Math.random() * lim); 

		System.out.println(a + " " + b + " " + c );
		int minNumber = (Math.min(c,Math.min(a,b))); 
		int maxNumber = (Math.max(c,Math.max(a,b)));
		int d = Math.min(a,b);
		int e = Math.min(a,c);
		int f = Math.min(b,c);
		int middleNumber = Math.max(f,Math.max(d,e));

		System.out.println(minNumber + " " + middleNumber + " " + maxNumber);
	}
}
