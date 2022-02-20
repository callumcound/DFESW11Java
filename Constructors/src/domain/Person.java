package domain;

public class Person {
	private String firstName;
	private String surname;
	private int age;
	
	//default constructor
	public Person() {
		
	}
	//All argument constructor
	public Person(String firstName, String surname, int age) {
		this.firstName = firstName; //this had to match whatever is passed into the parameter
		this.surname = surname;
		this.age = age;
	}
	public Person(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", surname=" + surname + ", age=" + age + "]";
	}
	
	
	
}
