// Computes the future value of a saving investment.
// Example Input: % java FVCalc 100 10 2
// Example Output: After 2 years, $100 saved at 10.0% will yield $121
public class FVCalc {
	public static void main(String[] args){
		// camelCase
		// snake_case
		// PascalCase
		// Replace this comment with your code 
		String startMoney = args[0];
		String interestRate = args[1];
		String years = args[2];
		Double interestRateDouble = Double.parseDouble(interestRate);
		Double startMoneyDouble = Double.parseDouble(startMoney);
		Double yearsDouble = Double.parseDouble(years);
		double futureValue = startMoneyDouble * Math.pow(1 + interestRateDouble / 100, yearsDouble);
		System.out.println("After " + years + " years, a $" + startMoney +
		                   " saved at " + interestRateDouble + "% will yield $" + (int) futureValue);


	}
}