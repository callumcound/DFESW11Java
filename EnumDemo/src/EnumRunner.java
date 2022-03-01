import java.util.ArrayList;
import java.util.List;

public class EnumRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumDirections[] directions = EnumDirections.values();
		for(EnumDirections direct : directions) {
			System.out.println(direct);
			System.out.println(direct.getMotion());
			direct.statement();
		}
		
	}

}
