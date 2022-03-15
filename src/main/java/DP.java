import java.util.*;

public class DP {
  static public int climbStairs(int n) {
    int[] mem = new int[n + 1];
    return climb(n, mem);
  }
  static public int climb(int n, int[] mem) {
    if(n <= 1) return 1;
    if(mem[n] != 0) return mem[n];
    int count = climb(n - 1, mem) + climb(n - 2, mem);
    mem[n] = count;
    return count;
  }

  static int coinChange(int[] coins, int amount) {
    Map<Integer, Integer> mem = new HashMap();
    int val = coinsNeededL(coins, amount, mem);
    if(val == Integer.MAX_VALUE) return -1;
    return val;
  }

  static int coinsNeededL(int[] coins, int amount, Map<Integer, Integer> mem) {
    if(amount <= 0) return 0;
    if(mem.containsKey(amount)) return mem.get(amount);
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < coins.length; i++) {
      if(coins[i] <= amount) { // this will never let amount go negative and min will remain Integer.MAX_VALUE
        int count = coinsNeededL(coins, amount - coins[i], mem);
        if(count != Integer.MAX_VALUE) count += 1;
        min = Math.min(min, count);
      }
    }
    mem.put(amount, min);
    return min;
  }
  static public int longestCommonSubsequence(String text1, String text2) {
    int[][] mem = new int[text1.length()][text2.length()];
    Arrays.stream(mem).forEach(arr -> Arrays.fill(arr, -1));
    return lcs(text1, text2, text1.length() - 1, text2.length() - 1, mem);
  }
  static public int lcs(String text1, String text2, int i, int j, int[][] mem) {
    if(i < 0 || j < 0) return 0;
    if(mem[i][j] != -1) return mem[i][j];
    int count = 0;
    if(text1.charAt(i) == text2.charAt(j)) count = 1 + lcs(text1, text2, i - 1, j - 1, mem);
    else count = Math.max(lcs(text1, text2, i - 1, j, mem), lcs(text1, text2, i, j - 1, mem));
    mem[i][j] = count;
    return count;
  }

  static public boolean wordBreak(String s, List<String> wordDict) {
    // Map<String, Boolean> mem = new HashMap<>();
    Boolean[][] mem = new Boolean[s.length() + 1][s.length() + 1];
    return wordBreakRec(s, 0, 1, new HashSet(wordDict), mem);
  }
  static boolean wordBreakRec(String s, Set<String> wordDict, Map<String, Boolean> mem) {
    if(s.isEmpty() || wordDict.contains(s)) return true;
    if(mem.containsKey(s)) return mem.get(s);
    for(int i = 1; i <= s.length(); i++) {
      String substring = s.substring(0, i);
      if(wordDict.contains(substring) && wordBreakRec(s.substring(i), wordDict, mem)) {
        mem.put(s, true);
        return true;
      }
    }
    mem.put(s, false);
    return false;
  }
  static boolean wordBreakRec(String s, int i, int j, Set<String> wordDict, Boolean[][] mem) {
    if((i >= s.length() && j >= s.length()) || wordDict.contains(s)) return true;
    if(i < s.length() && j > s.length()) return false;
    if(mem[i][j] != null) return mem[i][j];
    String substring = s.substring(i, j);
    if(wordDict.contains(substring) && wordBreakRec(s, j , j + 1, wordDict, mem)) {
      mem[i][j] = true;
      return true;
    }
    boolean res = wordBreakRec(s, i, j + 1, wordDict, mem);
    mem[i][j] = res;
    return res;
  }
  static public List<List<Integer>> combinationSum(int[] candidates, int target) {
    return combinationRec(candidates, target, 0);
  }
  static List<List<Integer>> combinationRec(int[] candidates, int target, int start) {
    if(target == 0) {
      List<Integer> list = new ArrayList<>();
      return List.of(list);
    }
    List<List<Integer>> res = new ArrayList<>();
    for(int i = start; i < candidates.length; i++) {
      if(candidates[i] <= target) {
        List<List<Integer>> curr = combinationRec(candidates, target - candidates[i], i);
        for(List<Integer> list : curr) {
          list.add(candidates[i]);
          res.add(list);
        }
      }
    }
    return res;
  }
  static public int rob(int[] nums) {
    int[] mem = new int[nums.length];
    Arrays.fill(mem, -1);
    return robRec(nums, nums.length - 1, mem);
  }
  static int robRec(int[] nums, int i, int[] mem) {
    if(i < 0) return 0;
    if(mem[i] != -1) return mem[i];
    mem[i] = Math.max(nums[i] + robRec(nums, i - 2, mem), robRec(nums, i - 1, mem));
    return mem[i];
  }
  static public int robC(int[] nums) {
    int lastIndex = nums.length - 1;
    int[] mem = new int[nums.length];
    Arrays.fill(mem, -1);
    int lastIncluded = nums[lastIndex] + robCRec(nums, lastIndex - 2, 1, mem);
    Arrays.fill(mem, -1);
    int firstIncluded = robCRec(nums, lastIndex - 1, 0, mem);
    return Math.max(firstIncluded, lastIncluded);
  }
  static int robCRec(int[] nums, int i, int end, int[] mem) {
    if(i < end) return 0;
    if(mem[i] != -1) return mem[i];
    mem[i] = Math.max(nums[i] + robCRec(nums, i - 2, end, mem), robCRec(nums, i - 1, end, mem));
    return mem[i];
  }
  static public int numDecodings(String s) {
    int[] mem = new int[s.length()];
    int res = numDecodingsRec(s, 0, mem);
    return res;
  }
  static int numDecodingsRec(String s, int i, int[] mem) {
    if(i == s.length()) return 1; // For this type of question when we get to the end of the string it means we had successfull decoding and that represent 1 single way.
    if(mem[i] != 0) return mem[i];
    int res = 0;
    if(s.charAt(i) != '0') res += numDecodingsRec(s, i + 1, mem);
    if(i + 2 <= s.length() && s.charAt(i) != '0' && Integer.parseInt(s.substring(i, i + 2)) <= 26) res += numDecodingsRec(s, i + 2, mem);
    mem[i] = res;
    return res;
  }
}
