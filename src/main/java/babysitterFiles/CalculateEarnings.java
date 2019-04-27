package babysitterFiles;

public class CalculateEarnings {

	private int regularRateEarned;
	private int bedtimeRateEarned;
	private int midnightRateEarned;
	private Babysitter babySitter = new Babysitter();
	
	public CalculateEarnings() {
		
	}

	public int calculateMidnightShiftHoursWorked(int timeEnd) {

		if (babySitter.timeConversion(timeEnd) > babySitter.timeConversion(12)) {
			return babySitter.timeConversion(timeEnd) - babySitter.timeConversion(12);
		} else
			return 0;

	}

	public int calculateBedtimeShiftHoursWorked(int timeStart, int bedTime) {

		if (babySitter.timeConversion(timeStart) < babySitter.timeConversion(12)) {
			return babySitter.timeConversion(12) - babySitter.timeConversion(bedTime);
		} else
			return 0;

	}

	public int calculateRegularShiftHoursWorked(int timeStart, int bedTime, int timeEnd) {

		if (babySitter.timeConversion(bedTime) >= babySitter.timeConversion(12)) {
			return babySitter.timeConversion(12) - (babySitter.timeConversion(timeStart));
		} else if (babySitter.timeConversion(bedTime) < babySitter.timeConversion(12)) {
			return babySitter.timeConversion(bedTime) - babySitter.timeConversion(timeStart);
		} else
			return 0;

	}

	public int calculateShiftEarnings(int timeStart, int bedTime, int timeEnd) {
		return (calculateRegularShiftHoursWorked(timeStart, bedTime, timeEnd) * regularRateEarned)
				+ (calculateBedtimeShiftHoursWorked(timeStart, bedTime) * bedtimeRateEarned)
				+ (calculateMidnightShiftHoursWorked(timeEnd) * midnightRateEarned);
	}

}
