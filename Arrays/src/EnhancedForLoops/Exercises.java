package EnhancedForLoops;

public class Exercises {
	
	public String[] stringArray = {"Stream", "Solange", "For", "Clear", "Skin"};
	public int[] numsArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	
	
	//Exercise One
	public void printArray() {
		for(String str : stringArray) {
			System.out.println(str);
		}
	}
	
	//ExerciseTwo
	public void printNumsArray() {
		for(int i : numsArray) {
			i *= i;
			System.out.println(numsArray[i]);
		}
	}
	
	//ExerciseThree
	public boolean enhancedForMethod(int num) {
		if(num % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	//ExerciseFour
//	public void exerciseFour() {
//		enhancedForMethod(num)
//		for(int num : numsArray) {
//				if(numsArray(num) == true) { 
//					System.out.println(num * num * num);
//				} else {
//					System.out.println(num * num);
//				}
			
//		}
//	}
	
}
