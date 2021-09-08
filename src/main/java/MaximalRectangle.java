import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {
    static public int maximalRectangle(char[][] matrix) {
        int res = 0;
        char[][] extended = new char[matrix.length][];
        for (int i = 0; i < extended.length; i++) {
            extended[i] = Arrays.copyOf(matrix[i], matrix[i].length + 1);
        }
        Stack<Integer[]> stack = new Stack<>();
        for (int i = 0; i < extended.length; i++) {
            for (int j = 0; j < extended[0].length; j++) {
                int height = 0;
                for (int k = i; k >= 0 && extended[k][j] == '1'; k--) {
                    height++;
                }
                int curr = j;
                while (!stack.isEmpty() && stack.peek()[1] > height) {
                    Integer[] pair = stack.pop();
                    int idx = pair[0];
                    int h = pair[1];
                    res = Math.max(res, (j - idx) * h);
                    curr = idx;
                }
                if (stack.isEmpty() || stack.peek()[1] != height)
                    stack.push(new Integer[]{curr, height});
            }
        }
        return res;
    }
}
