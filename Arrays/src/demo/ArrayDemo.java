package demo;

public class ArrayDemo {

	public static void main(String[] args) {
		//first method, creates empty array
		int[] ageArray;
		
		//second method, creates an array with values in it
		int[] array = {40, 60, 80, 100};
		String[] stringArray = {"Hello", "My", "Name", "Is", "Callum"};
		
		//how to print using a For Each loop
		for(String s : stringArray) { //<- here 's' is just a variable so can b anything.
			System.out.print(s + " ");
		}
		
		//third method, creates an array of a specific size (only 5 ints)
		int[] arraySize = new int[5]; 
		
		
		//Setting Values- setting the values for each index(0) individually.
		arraySize[0] = 5;
		
		
		
		
		
		
		//MULTI_DIMENSIONAL_ARRAYS
		//first method
		int[][] multiArray;
		
		//second method, declaring a MD array with values
		int[][]arrayMulti = {{3, 4},{5, 4}};
		
		//third method, [3] means 3 arrays with [2] values in each array
		int[][] arrayMult = new int[3][2];
		
		//arrayMult[][] = 21;
		
		
		
		//for loop
		
		int[][] loopArray = {{3, 4},{5, 4},{40, 35}};
		for(int i = 0; i < loopArray.length; i++) {
			for(int j = 0; j < loopArray[i].length; j++) {
				System.out.println(loopArray[i][j]);
			}
			System.out.println();
		}
		
		//Nested for each loop
		for(int[] a: loopArray) {
			for(int b : a) {
				System.out.println(b);
			}
			System.out.println();
		}
		
		//for and foreach loop together
		for(int i : array) {
			for(int j = 0; j < array.length; j++) {
				if(array[j] == i) {
					System.out.println(i);
				}
			}
		}
	}

}
