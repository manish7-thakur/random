import java.util.*;
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
      int l = 0, h = nums.length;
      while(l < h) {
        int mid = (l + h) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) l = mid + 1;
        else h = mid;
      }
      return l;
    }
    static int[] searchRange(int[] nums, int target) {
      int first = -1, last = -1;
      int l = 0, h = nums.length - 1;
      while(l <= h) {
        int m = (l + h) / 2;
        if(nums[m] == target) {
          first = m;
          h = m - 1;
        }
        else if(nums[m] < target) l = m + 1;
        else h = m - 1;
      }
      l = 0;
      h = nums.length - 1;
      while(l <= h) {
        int m = (l + h) / 2;
        if(nums[m] == target) {
          last = m;
          l = m + 1;
        }
        else if(nums[m] < target) l = m + 1;
        else h = m - 1;
      }
      return new int[]{first, last};
    }
    static List<Integer> findClosestElements(int[] arr, int k, int x) {
      List<Integer> res = new ArrayList();
      Queue<Integer> queue = new PriorityQueue<>();
      int pos = Arrays.binarySearch(arr, x);
      int arrPos = 0, l = 0, r = 0;
      if(pos < 0) {
        arrPos = -pos - 1;
        // System.out.println("Pos is : " + arrPos);
        l = arrPos - 1;
        r = arrPos;
      } else {
        queue.add(arr[pos]);
        arrPos = pos;
        // System.out.println("Pos is : " + arrPos);
        l = arrPos - 1;
        r = arrPos + 1;
      }
      while(queue.size() < k) {
        if(l >= 0 && r >= arr.length) {
          queue.add(arr[l]);
          l--;
        } else if(l < 0 && r < arr.length) {
          queue.add(arr[r]);
          r++;
        } else if(Math.abs(arr[l] - x) < Math.abs(arr[r] - x)) {
          queue.add(arr[l]);
          l--;
        } else if(Math.abs(arr[l] - x) == Math.abs(arr[r] - x) && arr[l] < arr[r]) {
          queue.add(arr[l]);
          l--;
        } else {
          queue.add(arr[r]);
          r++;
        }
      }
      while(!queue.isEmpty()) res.add(queue.remove());
      return res;
    }
}
