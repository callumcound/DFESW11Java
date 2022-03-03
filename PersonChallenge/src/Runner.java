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
		
		Pet petOne = new Pet("Kiev", "Cat");
		Pet petTwo = new Pet("Shonen", "Dog");
		
		
		PersonManager persons = new PersonManager();
		persons.addPerson(personOne);
		persons.addPerson(personTwo);
		persons.addPerson(personThree);
		persons.addPerson(personFour);
		persons.addPerson(personFive);
		persons.addPerson(personSix);
		persons.addPerson(personSeven);
		persons.addPerson(personEight);
		
		
		personOne.addPet(petOne);
		personSix.addPet(petTwo);
		persons.printStream();
//		System.out.println(personSix);
//		
//		
//		
	}

}
