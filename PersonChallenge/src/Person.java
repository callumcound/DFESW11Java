
public class Person {
	public String name;
	public int age;
	public String jobTitle;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	//int i = 0; i <= People.size(); i++
	
//	String personHunter(String name) {
//		for(Person person : peopleList) {
//			if()
//		}
//		return name;
//	}
	
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
	@Override
	public String toString() {
		return "This Person's name is " + name + "\ntheir age:" + age + "\n and their jobTitle is " + jobTitle + "\n";
	}
	
	
}
	
	

