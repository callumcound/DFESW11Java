package GarageChallengeQA;

import java.util.ArrayList;

public class Garage {
	public ArrayList<Vehicle> vehicles = new ArrayList<>();
	public ArrayList<Vehicle> found = new ArrayList<Vehicle>();{
		
//	for (Vehicle vehicle : vehicles) {
//		if(vehicle.getType() ) {
//			found.add(vehicle);}
//		}
	}	
		
	public void addVehicle(Vehicle v) {
		System.out.println("Adding to garage: " + v.getId());
		this.vehicles.add(v);
	}
	
	public void remVehicle(Vehicle v) {
		System.out.println("Leaving the garage: " + v.getId());
		this.vehicles.remove(v);
	}
	
	public void fixVehicle(Vehicle v) {
		System.out.println("Fixing vehicle: " + v.getId());
		System.out.println("Bill is: " + v.generateBill());
	}
	
	public void printVehicles() {
		for(Vehicle v : this.vehicles) {
			System.out.println(v);
		}
	}
	
	public void calculateIndBills() {
		for(Vehicle v : this.vehicles) {
			System.out.println(v.generateBill());
		}
	}
	
	public void emptyGarage() {
		this.vehicles.removeAll(vehicles);
	}
	
//	public void removeVehicleType(Class<Vehicle> type) {
//		for (int i = (vehicles.size() - 1); i >= 0; i++) {
//			if (type.isInstance(vehicles.get(i))) {
//				this.vehicles.remove(i);
//			}
//		}
//	public void removeByType(Object v) {
//		this.vehicles.removeAll(lorry);
//	}
	
}
