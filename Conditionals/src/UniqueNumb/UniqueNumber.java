package UniqueNumb;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	public static int uniqueMeth(int int1, int int2, int int3) {
//		if (int1 == int2 && int1 == int3 && int2 == int3){
//			return 0;
//		};
//		return 0;
	public int methodOne(int a, int b, int c) {
		if (a == b) {
			return c;
		} else if(a == c) {
			return b;
		} else if(c == b) {
			return a;
		} else {
			int total = a + b + c;
			return total;
		}
	}
}
