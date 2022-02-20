package calculatorExample;

public class Calculator {
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static int sub(int num1, int num2) {
		int sum = num1 - num2;
		return sum;
	}
	
	public static int mult(int num1, int num2) {
		int sum = num1 * num2;
		return sum;
	}
	
	public static double div(double num1, double num2) {
		double sum = num1 / num2;
		if (num1 > num2) {
			return sum;
	} 	else {
			System.out.print("Invalid Input");
			return 0.0;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(div(2, 3));
	}

}
