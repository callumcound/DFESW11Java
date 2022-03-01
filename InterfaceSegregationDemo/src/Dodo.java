
public class Dodo implements ExtinctCreature, EggLayingCreature {

	private String currentLocation;
	public int numberOfEggs;

	public Dodo(int initialEggCount) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void goExtinct() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getCurrentLocation() {
		this.setCurrentLocation("in a museum");
		return currentLocation;
	}

	@Override
	public void setCurrentLocation(String currentLocation) {
			this.currentLocation = currentLocation;
	
		
	}
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

}
