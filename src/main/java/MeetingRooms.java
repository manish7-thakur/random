import java.util.Arrays;

public class MeetingRooms {
    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static boolean possibleToAttendAll(Interval[] intervals) {
        if (intervals.length == 0 || intervals.length == 1) {
            return true;
        }
        Arrays.sort(intervals, (Interval int1, Interval int2) -> int1.start - int2.start);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < intervals[i - 1].end) {
                return false;
            }
        }
        return true;
    }
}