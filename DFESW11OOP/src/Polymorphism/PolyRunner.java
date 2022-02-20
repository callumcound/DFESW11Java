package Polymorphism;

import Polymorphism.ParentFactionClass;
import Polymorphism.ParentRaceClass;
import Polymorphism.SubClassClass;

@SuppressWarnings("unused")
public class PolyRunner {
	
	public static void main(String[] args) {
		
		ParentFactionClass horde = new ParentFactionClass();
		horde.warChant();
		horde.sayHi();
		
		ParentFactionClass hHorde = new ParentFactionClass();
		hHorde.warChant();
		((ParentFactionClass)hHorde).sayHi();
		
		Object object = new ParentRaceClass();
		((ParentRaceClass)object).warChant();
		((ParentRaceClass)object).sayHi();
		
		ParentFactionClass h = new ParentFactionClass();
		ParentRaceClass e = new ParentRaceClass();
		SubClassClass m = new SubClassClass();
		
		
		
		doVocalisation(h);
		doVocalisation(e);
		doVocalisation(m);
	}
	
	public static void doVocalisation(ParentFactionClass ref) {
		ref.warChant();
		ref.sayHi();
	}
}
