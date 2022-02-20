package FizzBuzz;

public class FizzBuzzRunner {
	public static void main(String[] args) {
		System.out.println(fizzBuzz(9));
		fizzBuzzVoid(10);
	}
	
	public static String fizzBuzz(int num) {
		if(num % 3 == 0) {
			return "Fizz";
		} else if (num % 5 ==0) {
			return "Buzz";
		} else if (num % 15 ==0) {
			return "FizzBuss";
		}
		return String.valueOf(num);
	}
	
	public static void fizzBuzzVoid(int num) {
		if(num % 15 == 0) {
			System.out.println("Fizz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else if (num % 3 == 0) {
			System.out.println("FizzBuzz");
		} else {
			System.out.println(num);
		}
		
	}
 }

