package GarageChallengeQA;

public class Lorry extends Vehicle{
//	public int wheels;
//	public boolean fuelType;
//	public String colour;
//	public int doors;
	
	private String cargo;
	private Object Lorry;
	
	public Lorry(String id, int wheels, boolean fuelType, String colour, String cargo) {
		super(id, wheels, fuelType, colour);
		this.cargo = cargo;
	}
	public double generateBill() {
		return wheels + 500;
	}
	@Override
	protected Object getType() {
		return Lorry;
	}


}
