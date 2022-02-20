package BlackJack;

public class BlackJackRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	};
	public static int game(int int1, int int2) {
		if (int1 < 0 || int2 < 0) {
			return 0;
		} else if (int1 > 21 && int2 >21) {
			return 0;
		} else if (int1 > 21) {
			return int2;
		} else if (int1 > int2) {
			return int1;
		} else {
			return int2;
		}
		}
	};

//This goes through checking conditionals (first four)
	// and then looks at which int (hands of cards) are higher.
	