package FlowChartExercise;

public class FlowChart {
	static int int1 = 2;
	static int int2 = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method(10, 2, true));
	}
	
	public static int method(int int1, int int2, boolean bool) {
		if (bool == true) {
			int sum = int1 + int2;
			return sum;
		} else {
			int sum = int1 * int2;
			return sum;
		}
	};
};
