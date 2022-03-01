package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class BlackjackExampleTest {
	    
	
	@Test
	public void testCond1() {
		assertEquals("Exp: draw", 0, BlackjackExample.play(22, 22));
	}
	@Test
	public void testCond2() {
		assertEquals("Exp: player wins", 1, BlackjackExample.play(22, 1));
	}
	@Test
	public void testCond3() {
		assertEquals("Exp: dealer wins", 1, BlackjackExample.play(1, 22));
	}
	@Test
	public void testCond4() {
			assertEquals("Exp: dealer wins", 20, BlackjackExample.play(1, 20));
	}
	}
	


