package Encapsulation;
//attributes
public class Tree {
	private String latinName;
	private String commonName;
	private boolean isTropical;
	private int numOfLeaves;
//default constructor, allows us to create an empty 'Tree' object
	Tree() {}

//limited constructor (practice)
	Tree(String latinName, String commonName, boolean isTropical) {
		latinName = this.latinName;
		commonName = this.commonName;
		isTropical = this.isTropical;
	}
//all argument constructor
	Tree(String latinName, String commonName, boolean isTropical, int numOfLeaves){
		latinName = this.latinName;
		commonName = this.commonName;
		isTropical = this.isTropical;
		numOfLeaves = this.numOfLeaves;
	}

// getters and setter for attributes
	public void setName(String newName) {
		commonName = newName;
	}
	
	public String getName() {
		return this.latinName;
	}
	
	public void setIsTropical(boolean newIsTropical) {
		isTropical = newIsTropical;
	}
	
	public boolean getIsTropical() {
		return this.isTropical;
	}
	
	
}
