package GarageChallengeQA;



public abstract class Vehicle {
	public String id;
	public int wheels;
	public boolean fuelType;
	public String colour;
	
	
	public Vehicle(String id, int wheels) {
		this.id = id;
		this.wheels = wheels;
	}
	public Vehicle(String id, int wheels, boolean fuelType) {
		this.id = id;
		this.wheels = wheels;
		this.fuelType = fuelType;
	}
	public Vehicle(String id, int wheels, boolean fuelType, String colour) {
		this.id = id;
		this.wheels = wheels;
		this.fuelType = fuelType;
		this.colour = colour;
		
	}
	
	public abstract double generateBill();
	
	//Below, the getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public boolean isFuelType() {
		return fuelType;
	}

	public void setFuelType(boolean fuelType) {
		this.fuelType = fuelType;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", wheels=" + wheels + ", fuelType=" + fuelType + ", colour=" + colour + "]";
	}
	protected abstract Object getType();
	
	
}
