import java.util.ArrayList;
import java.util.Scanner;

//NOTE FOR JORDAN, I got stumped at creating a search by Name function :' ) so close yet so far

public class Runner {
	public static void main(String[] args) {
		
		Person personOne = new Person("Kev", 40, "Poet");
		Person personTwo = new Person("Sherelle", 24, "DJ");
		Person personThree = new Person("Jerry", 32, "Graphic Designer");
		Person personFour = new Person("Keith", 28, "Graphic Designer");
		Person personFive = new Person("Johnothy", 35, "Television Repairperson");
		Person personSix = new Person("Nia", 32, "Support Worker");
		Person personSeven = new Person("Beverly", 85, "Model");
		Person personEight = new Person("Kim", 29, "Brazilian Jiu Jitsu Instructor");
		
		
		ArrayList<Object> peopleList = new ArrayList<>();
		
		peopleList.add(personOne);
		peopleList.add(personTwo);
		peopleList.add(personThree);
		peopleList.add(personFour);
		peopleList.add(personFive);
		peopleList.add(personSix);
		peopleList.add(personSeven);
		peopleList.add(personEight);
		
//		personHunter("Kev");
		
//		System.out.println(peopleList);
		
	}

}
