package droidConstructorCodecademy;

public class Droid {

		  String name;
		  int batteryLevel;
		  
		  public Droid(String droidName){
		    name = droidName;
		    batteryLevel = 100;
		  }
		  public String toString(){
		    return "Beep Boop, I'm droid: " + name;
		  }
		  public void performTask(String task){
		    System.out.println(name + " is performing task: " + task);
		    batteryLevel -= 10;
		  }
		  public int energyReport(){
		    System.out.println("Battery level is at: " + batteryLevel);
		    return batteryLevel;
		  }

		  public static void main(String[] args) {
		    Droid codey = new Droid("Codey");
		    Droid darren = new Droid("Darren");

		    System.out.println(codey);
		    codey.performTask("beepin and boopin");
		    codey.performTask("cheese throwing competition");
		    codey.performTask("floristry");
		    codey.energyReport();

		    System.out.println(darren);
		    darren.performTask("butter sculpting");
		    darren.performTask("reorganising chairs");
		    darren.energyReport();
		  }
		
}
