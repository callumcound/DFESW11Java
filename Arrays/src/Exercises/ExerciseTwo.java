package Exercises;

public class ExerciseTwo {

	public static void main(String[] args) {
		int[] exerciseTwo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
			for(int i = 0; i >= 10; i++) {
				exerciseTwo[i] = exerciseTwo[i] * 10;
				System.out.print(exerciseTwo[i]);				
			}
			for(int i = 0; i > exerciseTwo.length; i++) {
				System.out.println(exerciseTwo[i]);
				
			}System.out.println();
	} 

}
