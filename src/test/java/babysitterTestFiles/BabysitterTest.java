package babysitterTestFiles;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import babysitterFiles.Babysitter;

public class BabysitterTest {
	
	private Babysitter sitterTester;
	
	@Before
	public void startupOnEachTest() {
		sitterTester = new Babysitter();
	}

	@Test
	public void validateTimeConversionFrom5pmto1() {
        assertEquals(1, sitterTester.timeConversion(5));
    }
	
	@Test
	public void validateTimeConversionFrom4amto12() {
		assertEquals(12, sitterTester.timeConversion(4));
	}
	
	@Test
	public void validateTimeConversionFrom12pmto8() {
		assertEquals(8, sitterTester.timeConversion(12));
	}
	
	@Test
	public void validateBabySitterEnteredAcceptableStartTime() {
		assertEquals("This start time is available.", sitterTester.shiftStartValidation(6));
	}
	
	@Test
	public void verifyErrorMessageIfInvalidStartTime() {
		assertEquals("This start time is not available.", sitterTester.shiftStartValidation(3));
	}
	
	@Test
	public void validateBabySitterEnteredAcceptableEndTime() {
		assertEquals("This end time is available.", sitterTester.shiftEndValidation(2, 6));
	}
	
	@Test
	public void verifyErrorMessageIfInvalidEndTime() {
		assertEquals("This end time is not available.", sitterTester.shiftEndValidation(6, 7));
	}

}
