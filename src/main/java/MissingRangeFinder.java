import java.util.ArrayList;

public class MissingRangeFinder {
    public static ArrayList<String> find(int[] ranges, int l, int h) {
        ArrayList<String> res = new ArrayList<>();
        if (ranges.length == 0) {
            if (l == h) {
                res.add(l + "");
            } else {
                res.add(l + "->" + h);
            }
            return res;
        }
        int i = 0;
        while (i < ranges.length) {
            if (l < ranges[i]) {
                int curr = ranges[i] - 1;
                if (l == curr) {
                    res.add("" + l);
                } else {
                    res.add("" + l + "->" + curr);
                }
            }
            l = ranges[i] + 1;
            i++;
        }
        if (l < h) {
            res.add("" + l + "->" + h);
        } else if (l == h) {
            res.add("" + l);
        }
        return res;
    }
}