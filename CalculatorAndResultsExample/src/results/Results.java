package results;

public class Results {
	
	private static int physics = 30;
	private static int biology = 40;
	private static int chemistry = 50;
	private static int total;
	private static float percentage;
	
	
	public static int marksOverall() {
		System.out.println("Your physics scores is " + physics);
		System.out.println("Your biology scores is " + biology);
		System.out.println("Your chemistry scores is " + chemistry);
		total = physics + chemistry + biology;
		System.out.println("Your total score " + total + " / 450");
		return total;
	}
	public static double markPercentage() {
		System.out.println("Your physics scores is " + physics);
		System.out.println("Your biology scores is " + biology);
		System.out.println("Your chemistry scores is " + chemistry);
		total = physics + chemistry + biology;
		percentage =  (total * 100)/450;
		System.out.println("Your average percentage across all tests is: " + percentage + "%");
		return percentage;
		
	}
}
