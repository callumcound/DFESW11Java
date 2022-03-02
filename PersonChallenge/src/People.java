import java.util.ArrayList;
import java.util.Scanner;

public class People {
	static ArrayList<Object> peopleList = new ArrayList<>();
	
	
	public static Person personHunter(String name) {
		for(Object person : peopleList) {
			if(person.equals(name)) {
				return (Person) person;
			}
		}
		return null;
	}
	
		
	
		
	
}
