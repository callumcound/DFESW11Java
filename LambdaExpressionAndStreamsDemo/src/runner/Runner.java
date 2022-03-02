package runner;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();

		stringList.add("Callum");
		stringList.add("Cam");
		stringList.add("Cheryl");
		stringList.add("Carly");
		stringList.add("Craic");

//		stringList.forEach(words -> System.out.println(words));

		// Using logic through Lambda in a list to remove value equal to 'Carly'
//		stringList.forEach(words -> {if(!words.equals("Carly")) System.out.println(words);});

	}

}
