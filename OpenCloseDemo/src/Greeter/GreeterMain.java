package Greeter;

public class GreeterMain {
	private Greeting greeting;
	
	public void Greeter(Greeting greeting) {
		this.greeting = greeting;
	}
	public String greet() {
		return this.greet();
	}

	public Greeting getGreeting() {
		return greeting;
	}
	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	public static void main(String[] args) {
		FormalGreeting formalGreeting = new FormalGreeting();
		// TODO Auto-generated method stub
		formalGreeting.greeting();
		
		CasualGreeting casualGreeting = new CasualGreeting();
		casualGreeting.greeting();
	}

}
