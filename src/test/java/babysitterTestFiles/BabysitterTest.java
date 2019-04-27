package babysitterTestFiles;
import static org.junit.Assert.*;

import org.junit.Test;

import babysitterFiles.Babysitter;

public class BabysitterTest {

	@Test
	public void validateTimeConversionFrom5pmto0() {
        Babysitter babySitter = new Babysitter(5, 7, 4);
        assertEquals(0, babySitter.convertTime(5));
    }
	
	@Test
	public void validateTimeConversionFrom4amto11() {
		Babysitter babySitter = new Babysitter(5, 7, 4);
		assertEquals(11, babySitter.convertTime(4));
	}
	
	@Test
	public void validateTimeConversionFrom12pmto7() {
		Babysitter babySitter = new Babysitter(5, 12, 4);
		assertEquals(7, babySitter.convertTime(12));
	}
	
	@Test
	public void validateBabySitterEnteredAcceptableShiftTime() {
		Babysitter babySitter = new Babysitter(6, 10, 2);
		assertEquals("Shift time is confirmed.", babySitter.shiftValidation(6, 2));
	}
	
	@Test
	public void verifyErrorMessageIfInvalidStartTime() {
		Babysitter babySitter = new Babysitter(3, 12, 4);
		assertEquals("This start time is not available.", babySitter.shiftValidation(3, 4));
	}
	
	@Test
	public void verifyErrorMessageIfInvalidEndTime() {
		Babysitter babySitter = new Babysitter(7, 12, 6);
		assertEquals("This end time is not available.", babySitter.shiftValidation(7, 6));
	}

}
