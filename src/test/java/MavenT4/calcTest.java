package MavenT4;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class calcTest {

	
	Calc testCalc = new Calc();

	@Test
	void AddTest() {
		assertTrue(testCalc.add(2, 2) == 4);
	}
	
	@Test
	void SubtractTest() {
		assertTrue(testCalc.add(2, 2) == 0);
	}
}