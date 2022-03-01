
public enum EnumDirections {
	NORTH("N", "Forward"),
	EAST("E", "Right"),
	SOUTH("S", "Backward"),
	WEST("W", "Left");
	
	private final String Abrev;
	private final String Motion;
	
	public String getMotion() {
		return Motion;
	}
	
	public String statement() {
		System.out.println(Abrev + " is the same as moving " + Motion);
		return Abrev + "is the same of amoving " + Motion;
	}

	EnumDirections(String Abrev, String Motion){
		this.Abrev = Abrev;
		this.Motion = Motion;
	}
}
