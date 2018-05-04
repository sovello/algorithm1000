package space.fugit;

import space.fugit.meeting.Meeting;
import space.fugit.meeting.MeetingsMerger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
public class MeetingsMergerTest {

	private static List<Meeting> meetings = new ArrayList<Meeting>();
	private static List<Meeting> unmerged = new ArrayList<Meeting>();
	
	@BeforeAll
	public static void setData() {
		meetings.add(new Meeting(3, 8));
		meetings.add(new Meeting(0, 1));
		meetings.add(new Meeting(9, 12));
		unmerged.add(new Meeting(4, 8));
		unmerged.add(new Meeting(10, 12));
		unmerged.add(new Meeting(3, 5));
		unmerged.add(new Meeting(9, 10));
		unmerged.add(new Meeting(0, 1));
		Collections.sort(meetings);
	}
	
	@Test
	void testGetMergedMeetings() {
		List<Meeting> mergedMeetings = MeetingsMerger.getMergedMeetings(unmerged);
		assertThat(meetings.size(), equalTo(mergedMeetings.size()));
		for( int i = 0; i < meetings.size(); i++) {
			assertThat(meetings.get(i), equalTo(mergedMeetings.get(i)));
		}
	}

}
