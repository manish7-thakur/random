public class MaxConsecutiveSeq {
    public static int find(TreeNode node) {
        return findNow(node, -1, 1, 1);
    }

    private static int findNow(TreeNode node, int parentVal, int count, int maxCount) {
        if (node == null) {
            return maxCount;
        }
        if (node.val == parentVal + 1) {
            count++;
            if (count > maxCount) {
                maxCount = count;
            }
            return Math.max(findNow(node.left, node.val, count, maxCount), findNow(node.right, node.val, count, maxCount));
        } else {
            return Math.max(findNow(node.left, node.val, 1, maxCount), findNow(node.right, node.val, 1, maxCount));
        }
    }
}