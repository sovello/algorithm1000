package space.fugit.meeting;

public class Meeting implements Comparable <Meeting> {
	
	private int startTime;
	private int endTime;
	
	public Meeting(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	
	@Override
	public String toString() {
		return String.format("Meeting(%d, %d)", startTime, endTime);
	}
	
	@Override
	public boolean equals(Object o) {
		if( o == null) return false;
		if( o.getClass() != this.getClass()) return false;
		Meeting meeting = (Meeting)o;
		return (this.startTime==meeting.startTime) && (this.endTime == meeting.endTime);
	}
	
	@Override
	public int hashCode() {
		return 7 * this.startTime + 51;
	}

	@Override
	public int compareTo(Meeting o) {
		return this.getStartTime() - o.getStartTime();
	}
}
