package babysitterFiles;

public class Babysitter {

	private int timeStart;
	private int bedTime;
	private int timeEnd;

	public Babysitter() {

	}

	public int timeConversion(int timeEntered) {

		if (timeEntered <= 12 && timeEntered >= 5) {
			return timeEntered - 4;
		} else
			return timeEntered + 8;

	}

	public String shiftStartValidation(int timeStart) {
		if (timeConversion(timeStart) < 11 && timeStart > 4) {
			return "This start time is available.";
		} else {
			return "This start time is not available.";
		}
	}

	public String shiftEndValidation(int timeEnd, int timeStart) {
		if (timeConversion(timeEnd) > timeConversion(timeStart)) {
			return "This end time is available.";
		} else
			return "This end time is not available.";
	}

	public int getTimeStart() {
		return timeStart;
	}

	public int getBedTime() {
		return bedTime;
	}

	public int getTimeEnd() {
		return timeEnd;
	}

}
