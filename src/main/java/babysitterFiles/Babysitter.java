package babysitterFiles;

public class Babysitter {
	
	private int timeStart;
	private int bedTime;
	private int timeEnd;
	
//	public Babysitter() {
//		timeStart = 0;
//        timeEnd = 11;
//        bedTime = 5;
//        CalculateEarnings = new CalculateEarnings(timeStart, timeEnd, bedTime);
//    }
	
	public Babysitter(int timeStart, int bedTime, int timeEnd) {
		shiftValidation(timeStart, timeEnd);
		this.timeStart = timeStart;
		this.bedTime = bedTime;
		this.timeEnd = timeEnd;
//		CalculateEarnings = new CalculateEarnings(timeStart, timeEnd, bedTime);
	}
	
	public int convertTime(int timeEntered) {

		if (timeEntered <= 12 && timeEntered >= 5) {
			return timeEntered - 5;
		} else
			return timeEntered + 7;

	}
	
	public String shiftValidation(int timeStart, int timeEnd) {
		if (convertTime(timeStart) > 11) {
            return "This start time is not available.";
        } else if (convertTime(timeEnd) < convertTime(timeStart)) {
            return "This end time is not available.";
        } else {
        	return "Shift time is confirmed.";
        }
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
