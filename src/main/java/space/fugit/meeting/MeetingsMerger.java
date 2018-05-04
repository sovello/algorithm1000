package space.fugit.meeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingsMerger {

	public static List<Meeting> getMergedMeetings(List<Meeting> meetings){
		List<Meeting> mergedMeetings = new ArrayList<Meeting>();
		/**
		 * Sort the list first
		 */
		//Collections.sort(meetings, (Meeting m1, Meeting m2) -> m1.getStartTime() - m2.getStartTime());
		Collections.sort(meetings);
		mergedMeetings.add(meetings.get(0));
		for( Meeting currentMeeting : meetings) {
			Meeting previousMeeting = mergedMeetings.get(mergedMeetings.size() - 1);
			
			if( previousMeeting.getEndTime() >= currentMeeting.getStartTime()) {
				previousMeeting.setEndTime(Math.max(previousMeeting.getEndTime(), currentMeeting.getEndTime()));
			}
			else {
				mergedMeetings.add(currentMeeting);
			}
		}
		return mergedMeetings;
	}
}
