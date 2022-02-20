package Inheritance;

public class animalsMammals extends animals {
	public boolean vertebrate = true;
	public String species;
	public boolean isHairy;
	
	animalsMammals() {}

	animalsMammals(String species, boolean isHairy){
		species = this.species;
		isHairy = this.isHairy;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	public void setIsHairy(boolean isHairy) {
		this.isHairy = isHairy;
	}
	
	public boolean getIsHairy() {
		return this.isHairy;
	}
}
