package babysitterTestFiles;
import static org.junit.Assert.*;

import org.junit.Test;

import babysitterFiles.Babysitter;

public class BabysitterTest {

	@Test
	public void validateBabySitterDefaultShiftTime() {
        Babysitter babySitter = new Babysitter();
        assertEquals(17, babySitter.getTimeStart());
        assertEquals(4, babySitter.getTimeEnd());
        assertEquals(21, babySitter.getBedTime());
    }
	
	@Test
	public void validateUserEnteredStartTimeAndIsReturned() {
		Babysitter babySitter = new Babysitter(19, 21, 2);
		assertEquals(19, babySitter.getTimeStart());
	}
	
	@Test
	public void validateUserEnteredEndTimeAndIsReturned() {
		Babysitter babySitter = new Babysitter(18, 21, 3);
		assertEquals(2, babySitter.getTimeEnd());
	}

}
