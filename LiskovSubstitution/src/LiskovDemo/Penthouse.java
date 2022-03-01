package LiskovDemo;

public class Penthouse {
	int squareFootage;
	int numberOfBedrooms;
	
	    public Penthouse() {
	        this.setNumberOfBedrooms(4);
	    }

	    private void setNumberOfBedrooms(int i) {
			this.setNumberOfBedrooms(i);
			
		}

		public void setSquareFootage(int sqft) {
	        this.setSquareFootage(this.getSquareFootage());
	    }

		int getSquareFootage() {
			// TODO Auto-generated method stub
			return squareFootage;
		}

		public int getNumberOfBedrooms() {
			// TODO Auto-generated method stub
			return numberOfBedrooms;
		}
	}

