package babysitterFiles;

public class Babysitter {
	
	private int timeStart;
	private int bedTime;
	private int timeEnd;
	
	public Babysitter() {
		timeStart = 17;
        timeEnd = 4;
        bedTime = 21;
//        CalculateEarnings = new CalculateEarnings(timeStart, timeEnd, bedTime);
    }
	
	public Babysitter(int timeStart, int bedTime, int timeEnd) {
		shiftValidation(timeStart, timeEnd);
		this.timeStart = timeStart;
		this.bedTime = bedTime;
		this.timeEnd = timeEnd;
//		CalculateEarnings = new CalculateEarnings(timeStart, timeEnd, bedTime);
	}
	
	public String shiftValidation(int timeStart, int timeEnd) {
		if (timeStart < 17 && timeStart > 4) {
            return "This start time is not available";
        } else if (timeEnd < 17 && timeEnd > 4) {
            return "This end time is not available";
        } else {
        	return null;
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
