package Coins;

public class CoinsRunnerWorking {
	public static void change(int cost, int amount) {
		int twentyPounds = 0;
		int tenPounds = 0;
		int fivePounds = 0;
		int twoPounds = 0;
		int onePounds = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		while(amount - cost >= 20000) {
			twentyPounds++;
			amount -= 20000;
		}
		while(amount - cost >= 10000) {
			tenPounds++;
			amount -= 100000;
		}
		while(amount - cost >= 5000) {
			fivePounds++;
			amount -= 5000;
		}
	}
}
