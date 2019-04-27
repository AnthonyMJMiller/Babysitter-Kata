package babysitterTestFiles;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import babysitterFiles.CalculateEarnings;

public class CalculateEarningsTest {
	
	private CalculateEarnings paymentTester;
	
	@Before
	public void startupOnEachTest() {
		paymentTester = new CalculateEarnings();
	}
	
	// Testing validation of midnight hours worked by babysitter
	@Test
	public void verify4HoursWorkedFromMidnightTo4am() {
		assertEquals(4, paymentTester.calculateMidnightShiftHoursWorked(4));
	}
	
	@Test
	public void verify3HoursWorkedFromMidnightTo3am() {
		assertEquals(3, paymentTester.calculateMidnightShiftHoursWorked(3));
	}
	
	@Test
	public void verifyNoHoursWorkedFromMidnight() {
		assertEquals(0, paymentTester.calculateMidnightShiftHoursWorked(12));
	}
	
	// Testing validation of bed time hours worked by babysitter
	@Test
	public void verify3HoursWorkedFrom9pmBedTimeToMidnight() {
		assertEquals(3, paymentTester.calculateBedtimeShiftHoursWorked(5, 9));
	}
	
	@Test
	public void verify2HoursWorkedFrom10pmBedTimeToMidnight() {
		assertEquals(2, paymentTester.calculateBedtimeShiftHoursWorked(5, 10));
	}
	
	@Test
	public void verifyNoHoursWorkedFromBedTimeToMidnight() {
		assertEquals(0, paymentTester.calculateBedtimeShiftHoursWorked(12, 10));
	}
	
	// Testing validation of regular hours worked by babysitter
	@Test
	public void verify7HoursWorkedFromStartTime5pmUntilMidnight() {
		assertEquals(7, paymentTester.calculateRegularShiftHoursWorked(5, 4, 4));
	}
	
	@Test
	public void verify5HoursWorkedFromStartTime7pmUntilMidnight() {
		assertEquals(5, paymentTester.calculateRegularShiftHoursWorked(7, 4, 4));
	}
	
	// Testing payment calculation for each family the babysitter works with
	// The family payment info was pulled from the kata
	@Test
	public void shouldReturn136ForFamilyB() {
		assertEquals(136, paymentTester.calculateShiftEarnings(5, 9, 4, 12, 8, 16));
	}

	@Test
	public void shouldReturn195ForFamilyA() {
		assertEquals(195, paymentTester.calculateShiftEarnings(5, 10, 4, 15, 20, 20));
	}
	
	@Test
	public void shouldReturn183ForFamilyC() {
		assertEquals(183, paymentTester.calculateShiftEarnings(5, 8, 4, 21, 15, 15));
	}

}
