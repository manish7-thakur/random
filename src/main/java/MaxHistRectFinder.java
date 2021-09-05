import java.util.ArrayDeque;
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
            while (!stack.isEmpty() && stack.peek()[1] > padArr[i]) {
                Integer[] p = stack.pop();
                res = Math.max(res, (i - p[0]) * p[1]);
                nextIdx = p[0];
            }
            if(stack.isEmpty() || stack.peek()[1] != padArr[i])
                stack.push(new Integer[]{nextIdx, padArr[i]});
        }
        return res;
    }
}
