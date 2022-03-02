package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		Stream<Integer> numStream = nums.stream();

		// making a list with data in it (1 - 10)
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		numbers.stream().forEach(x -> System.out.println(x));

		// Map method
		List<Integer> mapNums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> expression = mapNums.stream().map(x -> 2 * x + 3).collect(Collectors.toList());
		List<Integer> mult = mapNums.stream().map(x -> 2 * x).collect(Collectors.toList());

//		System.out.println(mult);

		// Filter method - filters by .contains(value) to return all values with value
		List<String> stringList = new ArrayList<>();

		stringList.add("Callum");
		stringList.add("Cam");
		stringList.add("Cheryl");
		stringList.add("Carly");
		stringList.add("Craic");

		List<String> namez = stringList.stream().filter(s -> s.contains("l")).collect(Collectors.toList());
//		System.out.println(name);

		// Sorted method - sorts it in numeric order
		List<Integer> unorderedNums = Arrays.asList(4, 6, 1, 3, 7, 6);
		List<Integer> orderNums = unorderedNums.stream().sorted().collect(Collectors.toList());
//		System.out.println(orderNums);

		// Sorted strings- alphabetical order
		List<String> cakes = Arrays.asList("Red Velvet", "Sponge", "Walnuts", "Carrot", "Pastries");
		List<String> orderedCakes = cakes.stream().sorted().collect(Collectors.toList());
		//sorted reverse order (sorted(comparator.reverseorder()))
		List<String> reverseCakes = cakes.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println(reverseCakes);
		
		//Reduce method - reduce values by performing mathematical operations on them - in this case adding the values
		List<Integer> ints = Arrays.asList(3, 4, 6, 12);
		int answer = ints.stream().reduce((a, b) -> a+b).get();		
//		System.out.println(answer);
		//Reduce with multiple methods (.map and .reduce)- be aware of the order of the functions
		int answerTwo = ints.stream().map(x -> x*x).reduce((a,b) -> a+b).get();
//		System.out.println(answerTwo);
		
		
		//QA Community exercises
		//1
		List<String> names = new ArrayList<>();
		names.add("James");
		names.add("Michael");
		names.add("Dean");
		names.add("Chris");
		List<String> name = names.stream().map(s -> "Hello " + s).filter(s -> !s.contains("James")).collect(Collectors.toList());
		System.out.println(name);

		
		//2
		List<Integer> integerStream = Arrays.asList(3, 4, 7, 8, 12);
		int reducedIntegerStream = integerStream.stream().reduce((a, b) -> a * b).get();
//		System.out.println(reducedIntegerStream);
		
		//3
		List<Integer> exerciseThree = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//3a
		int exerciseThreeA = exerciseThree.stream().reduce((a, b) -> Integer.max(a, b)).get();
//		int exerciseThreeA = exerciseThree.stream().max((a,b) -> Integer.compare(a, b)));
//		System.out.println(exerciseThreeA);
		//3b
		int exerciseThreeB = exerciseThree.stream().reduce((a, b) -> Integer.min(a, b)).get();
//		System.out.println(exerciseThreeB);
		
		//3c
		List<Integer> exerciseThreeC = exerciseThree.stream().filter(a -> (a % 2 != 0)).collect(Collectors.toList());
		System.out.println(exerciseThreeC);
		//3d
		List<Integer> exerciseThreeD = exerciseThree.stream().filter(a -> (a % 2 == 0)).collect(Collectors.toList());
		System.out.println(exerciseThreeD);
		//3e
		int exerciseThreeE = exerciseThree.stream().reduce((a, b) -> a + b).get();
		System.out.println(exerciseThreeE);
		//3f
		Optional<Integer> exerciseThreeF = exerciseThree.stream().map(x -> x*x).filter(x -> x % 2 != 0).min((a, b) -> Integer.compare(a,  b));
		System.out.println(exerciseThreeF);
	}

}
