
public class Falcon implements FlyingCreature, EggLayingCreature {
	private int numberOfEggs;
	private String currentLocation;
	public Falcon(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		this.setNumberOfEggs(getNumberOfEggs() + 1);
	}
	public int getNumberOfEggs() {
		return numberOfEggs;
	}
	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

	@Override
	public void fly(String currentLocation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}


}
