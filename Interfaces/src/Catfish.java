
public abstract class Catfish implements Carnivore, Herbivore, SeaCreature{
	
	public int depth() {
		return 2;
	}
	
	public boolean insectsEat() {
		return true;
	}
	
	public String bigOrSmall() {
		return "small";
	}
	
	public boolean leaves() {
		return false;
	}
	
	public String typeOfBerries() {
		return "dingleberries";
	}
}
