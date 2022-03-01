package LiskovDemo;

public class Studio{
	private int numberOfBedrooms;
	private int squareFootage;
	
	    public Studio() {    	
	        this.setNumberOfBedrooms(0);
	    }

	  	    public void setSquareFootage(int sqft) {
	        this.squareFootage = sqft;
	    }
	    
	    public int getNumberOfBedrooms() {
	    	return numberOfBedrooms;
	    }
	    
	    public void setNumberOfBedrooms(int numberOfBedrooms) {
	    	this.numberOfBedrooms = numberOfBedrooms;
	    }
	}

