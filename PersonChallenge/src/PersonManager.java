import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	//part4
	List<Person> peopleList = new ArrayList<>();
	
	public PersonManager() {
		
	}
	public PersonManager(List<Person> peopleList) {
		this.peopleList = peopleList;
	}
	
	public void addPerson(Person person){
		peopleList.add(person);
	}
	
	public void removePerson(Person person) {
		peopleList.remove(person);
	}
//	public void addPet(Pet pet) {
//		this.Person
//	}
	//part5
	public void getByName(String name) {
		this.peopleList.stream().forEach(p -> {if(p.getName().equalsIgnoreCase(name)) System.out.println(p);});
	}
	
	//part5ForLoop
	public Person getByLoop(String name){
		for(Person p : peopleList) {
		if(p.getName().equalsIgnoreCase(name)) {
			return p;
		}
	}
		return null;
	}
	
	//part6 printing with an enhancedForLoop
	public void printPeople() {
		for(Person p : peopleList) {
			System.out.println(p);
		}
	}
	//p6 with a stream
	public void printStream() {
		this.peopleList.stream().forEach(p -> System.out.println(p));
	}
}
