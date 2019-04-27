package babysitterTestFiles;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import babysitterFiles.CalculateEarnings;

public class CalculateEarningsTest {
	
	private CalculateEarnings paymentTester;
	
	@Before
	public void StartupOnEachTest() {
		paymentTester = new CalculateEarnings();
	}

	@Test
	public void verify4HoursWorkedFromMidnightTo4am() {
		assertEquals(4, paymentTester.calculateMidnightShiftHoursWorked(4));
	}
	
	@Test
	public void verify3HoursWorkedFromMidnightTo3am() {
		assertEquals(3, paymentTester.calculateMidnightShiftHoursWorked(3));
	}

}
