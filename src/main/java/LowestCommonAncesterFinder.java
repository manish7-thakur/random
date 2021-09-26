import java.util.ArrayList;

public class LowestCommonAncesterFinder {
    static int forBST(TreeNode curr, int a, int b) {
        ArrayList<Integer> ancestersA = new ArrayList<>();
        if (findAncestors(curr, ancestersA, a)) return -1;
        ArrayList<Integer> ancestersB = new ArrayList<>();
        if (findAncestors(curr, ancestersB, b)) return -1;
        return findCommonAncestor(ancestersA, ancestersB);
    }

    private static int findCommonAncestor(ArrayList<Integer> ancestersA, ArrayList<Integer> ancestersB) {
        int i;
        for (i = 0; i < ancestersA.size() && i < ancestersB.size(); i++) {
            if (ancestersA.get(i) != ancestersB.get(i)) {
                return ancestersA.get(i - 1);
            }
        }
        return ancestersA.get(i - 1);
    }

    private static boolean findAncestors(TreeNode traverser, ArrayList<Integer> ancesters, int value) {
        while (traverser != null && traverser.val != value) {
            ancesters.add(traverser.val);
            if (value < traverser.val) {
                traverser = traverser.left;
            } else {
                traverser = traverser.right;
            }
        }
        if (traverser == null) {
            return true;
        }
        ancesters.add(traverser.val);
        return false;
    }


    private static boolean findBTAncestors(TreeNode traverser, ArrayList<Integer> ancesters, int value) {
        if (traverser == null) {
            return false;
        }
        ancesters.add(traverser.val);
        if (traverser.val == value) {
            return true;
        }
        if (findBTAncestors(traverser.left, ancesters, value) || findBTAncestors(traverser.right, ancesters, value))
            return true;
        ancesters.remove(ancesters.size() - 1);
        return false;
    }

    static int forBinaryTree(TreeNode curr, int a, int b) {
        ArrayList<Integer> ancestersA = new ArrayList<>();
        if (!findBTAncestors(curr, ancestersA, a)) return -1;
        ArrayList<Integer> ancestersB = new ArrayList<>();
        if (!findBTAncestors(curr, ancestersB, b)) return -1;
        return findCommonAncestor(ancestersA, ancestersB);
    }

    static TreeNode findAncestorRec(TreeNode curr, int key1, int key2, BoolPair pair) {
        if (curr == null) {
            return null;
        }
        if (curr.val == key1) {
            pair.b1 = true;
            return curr;
        }
        if (curr.val == key2) {
            pair.b2 = true;
            return curr;
        }
        TreeNode leftSubtree = findAncestorRec(curr.left, key1, key2, pair);
        TreeNode rightSubtree = findAncestorRec(curr.right, key1, key2, pair);
        if (leftSubtree != null && rightSubtree != null) {
            return curr;
        }
        return leftSubtree == null ? rightSubtree : leftSubtree;
    }

    static class BoolPair {
        boolean b1 = false, b2 = false;
    }

    static boolean find(TreeNode curr, int key) {
        if (curr == null) {
            return false;
        }
        return curr.val == key || find(curr.left, key) || find(curr.right, key);
    }

    static int forBinaryTreeRecursion(TreeNode curr, int key1, int key2) {
        BoolPair pair = new BoolPair();
        TreeNode ancestor = findAncestorRec(curr, key1, key2, pair);
        //because we return the first found node, so we need 
        //to check the other one if it is present or not
        if (pair.b1 && pair.b2 || pair.b1 && find(ancestor, key2) || pair.b2 && find(ancestor, key1)) {
            return ancestor.val;
        } else {
            return -1;
        }
    }
}