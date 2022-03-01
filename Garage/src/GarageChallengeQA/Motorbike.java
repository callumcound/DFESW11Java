package GarageChallengeQA;

public class Motorbike extends Vehicle{
	
	private boolean isCool;
	private Object Motorbike;
	
	public Motorbike(String id, int wheels, boolean fuelType, String colour, String cargo, boolean isCool) {
		super(id, wheels, fuelType, colour);
		this.isCool = isCool;
	}
	
	public double generateBill() {
		return wheels * 750;
	}
	@Override
	protected Object getType() {
		return Motorbike;
	}


}
