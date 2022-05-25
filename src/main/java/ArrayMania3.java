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
      if(curr.isEmpty() || nums[i] >= curr.get(curr.size() - 1)) curr.add(nums[i]);
      findSubsequencesRec(nums, i + 1, res, curr);
      if(!curr.isEmpty()) curr.removeLast();
    }
  }
}
