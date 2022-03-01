
public class BackendDev implements Developer {
	public BackendDev() {
		writeJava();
	}

	@Override
	public void develop() {
		writeJava();
	}

	private void writeJava() {
		System.out.println("C# is just Microsoft Java anyway.");
	}
	
}
