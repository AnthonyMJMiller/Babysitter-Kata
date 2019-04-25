package babysitterFiles;

public class Babysitter {
	
	private int timeStart;
	private int bedTime;
	private int timeEnd;
	
	public Babysitter() {
		timeStart = 17;
        timeEnd = 4;
        bedTime = 21;
        TimeCalculation = new TimeCalculation(timeStart, timeEnd, bedTime);
    }
	
	public Babysitter(int timeStart, int bedTime, int timeEnd) {
		shiftValidation(timeStart, timeEnd);
		this.timeStart = timeStart;
		this.bedTime = bedTime;
		this.timeEnd = timeEnd;
		TimeCalculation = new TimeCalculation(timeStart, timeEnd, bedTime);
	}
	
	public void shiftValidation(int timeStart, int timeEnd) {
		if (timeStart < 17 && timeStart > 4) {
            System.out.println("This start time is not available");
        } else if (timeEnd < 17 && timeEnd > 4) {
            System.out.println("This end time is not available");
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
