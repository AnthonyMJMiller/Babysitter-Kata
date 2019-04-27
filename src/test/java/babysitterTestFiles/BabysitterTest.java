package babysitterTestFiles;
import static org.junit.Assert.*;

import org.junit.Test;

import babysitterFiles.Babysitter;

public class BabysitterTest {

	@Test
	public void validateTimeConversionFrom5pmto0() {
        Babysitter babySitter = new Babysitter(5, 12, 4);
        assertEquals(0, babySitter.timeConversion(5));
    }
	
	@Test
	public void validateTimeConversionFrom4amto11() {
		Babysitter babySitter = new Babysitter(5, 12, 4);
		assertEquals(11, babySitter.timeConversion(4));
	}
	
	@Test
	public void validateTimeConversionFrom12pmto7() {
		Babysitter babySitter = new Babysitter(5, 12, 4);
		assertEquals(7, babySitter.timeConversion(12));
	}
	
	@Test
	public void validateBabySitterEnteredAcceptableStartTime() {
		Babysitter babySitter = new Babysitter(6, 10, 2);
		assertEquals("This start time is available.", babySitter.shiftStartValidation(6));
	}
	
	@Test
	public void verifyErrorMessageIfInvalidStartTime() {
		Babysitter babySitter = new Babysitter(4, 12, 4);
		assertEquals("This start time is not available.", babySitter.shiftStartValidation(3));
	}
	
	@Test
	public void validateBabySitterEnteredAcceptableEndTime() {
		Babysitter babySitter = new Babysitter(6, 10, 2);
		assertEquals("This end time is available.", babySitter.shiftEndValidation(2, 6));
	}
	
	@Test
	public void verifyErrorMessageIfInvalidEndTime() {
		Babysitter babySitter = new Babysitter(7, 12, 6);
		assertEquals("This end time is not available.", babySitter.shiftEndValidation(6, 7));
	}

}
