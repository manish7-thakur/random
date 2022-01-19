/**
 * Find a string in a sorted array of strings where individual string could be separated by any number of empty("") strings.
 */
public class BinarySearch {
    static int binarySearch(String[] strs, String s, int i, int j) {
        if (strs.length == 0) {
            return -1;
        }
        while (i <= j) {
            int mid = (i + j) / 2;
            if (strs[mid].equals(s)) {
                return mid;
            } else if (strs[mid].equals("")) {
                int k = mid;
                for (; k < strs.length && strs[k].equals(""); k++) ;
                if (strs[k].equals(s)) {
                    return k;
                } else if (s.compareTo(strs[k]) < 0) {
                    j = mid - 1;
                } else {
                    i = k + 1;
                }
            } else if (s.compareTo(strs[mid]) < 0) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
    static int firstBadVersion(int n, int bad) {
      int l = 1, h = n;
      while(l < h) {
        int m = (int)(((double)h + l) / 2); // can be l + (h-l) / 2;
        if(isBadVersion(m, bad)) h = m;
        else l = m + 1;
      }
      return h;
    }
    static boolean isBadVersion(int n, int bad) {
      return n >= bad;
    }

    static public int searchInsert(int[] nums, int target) {
      int l = 0, h = nums.length - 1;
      while(l < h) {
        int mid = (l + h) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) l = mid + 1;
        else h = mid - 1;
      }
      if(target > nums[l]) return l + 1;
      return l;
    }
}
