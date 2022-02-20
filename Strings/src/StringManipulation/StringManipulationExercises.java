package StringManipulation;

public class StringManipulationExercises {
			static String strObject = "yesterday it was raining";
			static String strObjectTwo = "today it is sunny";
			
			static String strObjectThree = strObject + strObjectTwo;
			
			
			
			public static String methodOne(String str) {
				int i = 0;
				int word = 0;
				
				for (i = 0; i < str.length(); i++) {
					if (str.substring(i, i + 1).equals(" ")) {
						i++;
					}
				}
				System.out.println("In your message there are " + (str + 1) + " wirds.");
				
//				for(int i = 0; i > str.length(); i++) {
//					str.split(" ");
//					return str;
//				}
//				System.out.println(str);
//				return str;
			}
			
			public void PrintingVertical(String str) {
				int i;
				String word = "";
				
				for (i = 0; i < str.length(); i++) {
					if (str.substring(i, i + 1).equals(" ")) {
						System.out.println(str);
						word = "";
					} else {
						word += str.substring(i, i + 1);
					}
				} System.out.println(word);
			}
			
			
			public static void main(String args[] ) {
			System.out.println(strObject.toUpperCase()+ ", "+ strObjectTwo.toUpperCase());
			System.out.println(strObjectTwo.substring(0, 6)+ strObject.substring(10, 24));
			System.out.println(methodOne(methodOne(strObject)));
			
			}
}

