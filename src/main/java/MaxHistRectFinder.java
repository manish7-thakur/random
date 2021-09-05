import java.util.Arrays;
import java.util.Stack;

public class MaxHistRectFinder {
    static public int largestRectangleArea(int[] heights) {
        int res = 0;
        int[] padArr = Arrays.copyOf(heights, heights.length + 1);
        Stack<Integer[]> stack = new Stack<>();
        int i;
        for (i = 0; i < padArr.length; i++) {
            int nextIdx = i;
            while (!stack.isEmpty() && padArr[stack.peek()[0]] > padArr[i]) {
                Integer[] p = stack.pop();
                res = Math.max(res, (i - p[0]) * p[1]);
                nextIdx = p[0];
            }
            stack.push(new Integer[]{nextIdx, padArr[i]});
        }
        return res;
    }
}
