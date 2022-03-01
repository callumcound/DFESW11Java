package GarageChallengeQA;

public class Runner {

	public static void main(String[] args) {
		
			Garage garage = new Garage();
		
			Car carOne = new Car("Darren's Car", 4, true, "blue", 3);
			Car carTwo = new Car("Sherelle's Car", 4, false, "silver", 4);
			
			Lorry lorryOne = new Lorry("TCB LORRY", 8, true, "multi", "lots of fish");
			
			
			
			
			garage.addVehicle(lorryOne);
			garage.addVehicle(carTwo);
			garage.printVehicles();
			garage.fixVehicle(lorryOne);
	//		garage.removeVehicleType(Class<Car>);
			garage.printVehicles();
	
	}

}