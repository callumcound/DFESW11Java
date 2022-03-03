import java.util.ArrayList;
import java.util.List;

public class Person {
	
	//attributes
	public String name;
	public int age;
	public String jobTitle;
	private List<Pet> pets = new ArrayList<>();
	
	
	//constructors
	public Person() {
		
	}
	
	
	public Person(String name, int age, String jobTitle, List<Pet> pets) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.pets = pets;
	}
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	@Override
	public String toString() {
		return "Person: \nname: " + name + "\nage:" + age + "\njobTitle:" + jobTitle + "\n" + pets + "\n";
	}

	public void addPet(Pet pet) {
		this.pets.add(pet);
	}
	
	public void removePet(Pet pet) {
		this.pets.remove(pet);
	}
}
	
	

