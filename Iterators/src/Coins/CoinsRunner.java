package Coins;

public class CoinsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static double cost = 4.58;
	public static double amount = 20.00;
	public static double totalChange = amount - cost;
	public static int twentyNotes = 0;
	public static int tenNotes = 0;
	public static int fiveNotes = 0;
	public static int twentyPence = 0;
	public static int twoPence = 0;
	public static double change(double cost, double amount) {
		
		for(totalChange = 0;totalChange <= 20.00;totalChange--) {
			if (totalChange < 20.00) {
				return tenNotes++;
			} else if (totalChange < 10.00) {
				return fiveNotes++;
			} else if (totalChange < 1.00) {
				return twentyPence++;
			} else {
				return twoPence++;
			}
		}
		System.out.print(amount);
		return amount;
		
	}
}
