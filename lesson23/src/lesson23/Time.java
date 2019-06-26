package lesson23;

public class Time {
	private int hour;
	private int minute;

	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	@Override
	public String toString() {
		if(this.hour > 9 && this.minute > 9) {
			return hour + ":" + minute;	
		} else if (this.hour > 9 && this.minute < 10){
			return hour + ":0" + minute;
		} else if (this.hour < 10 && this.minute > 9) {
			return "0" + hour + ":" + minute;
		} else {
			return "0" + hour + ":0" + minute;
		}
	}

	public static void timeSettings(Time time) {
		if (time.minute > 59) {
			time.minute -= 60;
			time.hour++;
		}
		if (time.hour > 23) {
			time.hour -= 24;
		}
	}
}
