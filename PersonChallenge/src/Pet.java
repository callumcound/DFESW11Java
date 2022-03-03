
public class Pet {
	private String name;
	private String typeOfAnimal;
	
	public Pet () {
		
	}
	public Pet(String name, String typeOfAnimal) {
		super();
		this.name = name;
		this.typeOfAnimal = typeOfAnimal;
	}
	@Override
	public String toString() {
		return "Pet: \nname: " + name + "\ntypeOfAnimal: " + typeOfAnimal + "\n";
	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getTypeOfAnimal() {
//		return typeOfAnimal;
//	}
//	public void setTypeOfAnimal(String typeOfAnimal) {
//		this.typeOfAnimal = typeOfAnimal;
//	}
	
}
