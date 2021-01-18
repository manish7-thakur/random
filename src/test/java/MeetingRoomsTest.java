import org.junit.Assert;
import org.junit.Test;

public class MeetingRoomsTest {
    @Test
    public void noMeetings() {
        MeetingRooms.Interval[] intervals = new MeetingRooms.Interval[]{};
        boolean actual = MeetingRooms.possibleToAttendAll(intervals);
        Assert.assertTrue(actual);
    }

    @Test
    public void oneMeeting() {
        MeetingRooms.Interval[] intervals = new MeetingRooms.Interval[]{new MeetingRooms.Interval(0, 15)};
        boolean actual = MeetingRooms.possibleToAttendAll(intervals);
        Assert.assertTrue(actual);
    }

    @Test
    public void twoMeetings() {
        MeetingRooms.Interval[] intervals = new MeetingRooms.Interval[]{new MeetingRooms.Interval(0, 15), new MeetingRooms.Interval(10, 20)};
        boolean actual = MeetingRooms.possibleToAttendAll(intervals);
        Assert.assertFalse(actual);
    }

    @Test
    public void threeMeetings() {
        MeetingRooms.Interval[] intervals = new MeetingRooms.Interval[]{new MeetingRooms.Interval(0, 30), new MeetingRooms.Interval(5, 10),
                new MeetingRooms.Interval(15, 20)};
        boolean actual = MeetingRooms.possibleToAttendAll(intervals);
        Assert.assertFalse(actual);
    }

    @Test
    public void fourMeetings() {
        MeetingRooms.Interval[] intervals = new MeetingRooms.Interval[]{new MeetingRooms.Interval(0, 30), new MeetingRooms.Interval(30, 35),
                new MeetingRooms.Interval(35, 40), new MeetingRooms.Interval(40, 50)};
        boolean actual = MeetingRooms.possibleToAttendAll(intervals);
        Assert.assertTrue(actual);
    }
}