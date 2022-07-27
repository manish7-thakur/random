import java.util.*;

public class ArrayMania3 {
  static int majorityElement(int[] nums) {
    int res = 0, count = 0;
    for(int n : nums) {
      if(count == 0) res = n;
      if(res == n) count++;
      else count--;
    }
    return res;
  }
  static List<Integer> majorityElement3(int[] nums) {
    List<Integer> res = new ArrayList<>();
    int num1 = 0, num2 = 0, c1 = 0, c2 = 0;
    for(int n : nums) {
      if(num1 == n) c1++;
      else if(num2 == n) c2++;
      else if(c1 == 0) {
        num1 = n;
        c1++;
      }
      else if(c2 == 0) {
        num2 = n;
        c2++;
      } else {
        c1--;
        c2--;
      }
    }
    int majMark = nums.length / 3;
    c1 = 0;
    c2 = 0;
    for(int n : nums) {
      if(num1 == n) c1++;
      else if(num2 == n) c2++;
    }
    if(c1 > majMark) res.add(num1);
    if(c2 > majMark) res.add(num2);
    return res;
  }
  static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for(int i : nums1) {
      for(int j: nums2) map.merge(i + j, 1, Integer::sum);
    }
    for(int i : nums3) {
      for(int j : nums4) count += map.getOrDefault(-(i + j), 0);
    }
    return count;
  }
  static List<Integer> findDuplicates(int[] nums) {
    List<Integer> res = new ArrayList<>();
    for(int i = 0; i < nums.length; i++) {
      int curr = Math.abs(nums[i]);
      int pos = curr - 1;
      if(nums[pos] < 0) res.add(curr);
      else nums[pos] = -nums[pos];
    }
    return res;
  }
  static List<List<Integer>> findSubsequences(int[] nums) {
    Set<List<Integer>> res = new HashSet<>();
    findSubsequencesRec(nums, 0, res, new ArrayList<>());
    return new ArrayList<>(res);
  }

  static void findSubsequencesRec(int[] nums, int start, Set<List<Integer>> res, List<Integer> curr) {
    if(curr.size() > 1) {
      res.add(new ArrayList<>(curr));
    }
    for(int i = start; i < nums.length; i++) {
      if(curr.isEmpty() || nums[i] >= curr.get(curr.size() - 1)) {
        curr.add(nums[i]);
        findSubsequencesRec(nums, i + 1, res, curr);
        curr.remove(curr.size() - 1); // add & remove should come together in an if block or for-loop block, try putting it outside if block
      }
    }
  }

  static void sortColors(int[] nums) {
    int l = 0, m = 0, h = nums.length - 1;
    while(m <= h) {
      if(nums[m] == 1) m++;
      else if(nums[m] == 0) {
        swap(nums, m, l);
        m++;
        l++;
      } else {
        swap(nums, m, h);
        h--;
      }
    }
  }
  static void swap(int[] nums, int l, int r) {
    int temp = nums[r];
    nums[r] = nums[l];
    nums[l] = temp;
  }
  static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    TreeSet<Long> treeSet = new TreeSet<>();
    for(int i = 0; i < nums.length; i++) {
      Long value = (long)nums[i];
      Long floor = treeSet.floor(value);
      if(floor != null && value - floor <= t) return true;
      Long ceiling = treeSet.ceiling(value);
      if(ceiling != null && ceiling - value <= t) return true;
      treeSet.add(value);
      if(treeSet.size() > k) treeSet.remove((long)nums[i - k]);
    }
    return false;
  }
  static int removeDuplicates(int[] nums) {
    int pos = 0;
    for(int i = 1; i < nums.length; i++) {
      if(nums[pos] != nums[i]) {
        pos++;
        nums[pos] = nums[i];
      }
    }
    return pos + 1;
  }

  static int[] dailyTemperatures(int[] temperatures) {
    int[] res = new int[temperatures.length];
    Stack<Integer> stack = new Stack<>();
    for(int i = 0 ; i < temperatures.length; i++) {
      while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
        int idx = stack.pop();
        res[idx] = i - idx;
      }
      stack.push(i);
    }
    return res;
  }
  // No fucking idea how did we come to this solution
  static int subarraySum(int[] nums, int k) {
    int count = 0, sum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for(int n : nums) {
      sum += n;
      count += map.getOrDefault(sum - k, 0);
      map.merge(sum, 1, Integer::sum);
    }
    return count;
  }
  static int findPeakElement(int[] nums) {
    int l = 0, h = nums.length - 1;
    while(l < h) {
      int m = (l + h) / 2;
      if(nums[m] < nums[m + 1]) l = m + 1;
      else h = m;
    }
    return l;
  }
  static int maxProfit(int[] prices) {
    int max = 0, min = prices[0];
    for(int i = 1; i < prices.length; i++) {
      if(prices[i] > min) {
        max += prices[i] - min;
        min = prices[i];
      }
      if(prices[i] < min) min = prices[i];
    }
    return max;
  }

  static int numUniqueEmails(String[] emails) {
    Set<String> set = new HashSet<>();
    for(String email : emails) {
      String[] parts = email.split("@");
      String localName = parts[0].substring(0, parts[0].indexOf('+') == -1 ? parts[0].length() : parts[0].indexOf('+')).replaceAll("\\.", "");
      set.add(localName + parts[1]);
    }
    return set.size();
  }
}
