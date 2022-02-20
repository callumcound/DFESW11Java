package Inheritance;

public class animalsReptiles extends animals {
	public boolean vertebrate = true;
	public String species;
	public boolean isCute;
	
	public animalsReptiles(){}
	
	public animalsReptiles(String species, boolean isCute){
		species = this.species;
		isCute = this.isCute;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isCute() {
		return isCute;
	}

	public void setCute(boolean isCute) {
		this.isCute = isCute;
	}

}
