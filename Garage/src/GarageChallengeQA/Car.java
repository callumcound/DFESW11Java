package GarageChallengeQA;

public class Car extends Vehicle{
//	public int wheels;
//	public boolean fuelType;
//	public String colour;
	private int seats;
    private Object Car;
	
	public Car(String id, int wheels, boolean fuelType, String colour, int seats) {
		super(id, wheels, fuelType, colour);
		this.seats = seats;
	}
	public double generateBill() {
	return wheels * seats;
}
	
	@Override
	protected Object getType() {
		return Car;
	}

}

