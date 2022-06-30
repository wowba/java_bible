package ch7;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time(12);
		System.out.println(t);
		t.setHour(t.getHour()+1);
		System.out.println(t);
	}
}

class Time {
	private int hour;

	Time(int hour) {
		setHour(hour);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public String toString() {
		return hour + "";
	}
}
