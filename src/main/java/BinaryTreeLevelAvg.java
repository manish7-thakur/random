import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class BinaryTreeLevelAvg {
    public static List<Double> calcAvgs(TreeNode node) {
        List<Double> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        calc(queue, list);
        return list;
    }
    public static int longestValidParentheses(String s) {
        int maxlength = 0;
        Stack<Integer> stack = new Stack();
        stack.push(-1);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if(stack.isEmpty()) {
                    stack.push(i);
                }
                    maxlength = Math.max(maxlength, i - stack.peek());
            }
        }

        return maxlength;
    }

    private static void calc(LinkedList<TreeNode> queue, List<Double> list) {
        double sum = 0;
        int count = 0;
        while (!queue.isEmpty()) {
            sum = 0;
            count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                sum += node.value;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(sum / count);
        }
    }
}