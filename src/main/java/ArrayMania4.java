import java.util.*;

public class ArrayMania4 {
  static void gameOfLife(int[][] board) {
    int[][] copy = Arrays.stream(board).map(int[]::clone).toArray(int[][]::new);
    int m = board.length - 1;
    int n = board[0].length - 1;
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[0].length; j++) {
          board[i][j] = getScore(copy, i, j, m, n);;
      }
    }
  }
  static int getScore(int[][] board, int i, int j, int m, int n) {
    int score = 0;
    if(i > 0 && board[i - 1][j] == 1) score++;
    if(i > 0 && j > 0 && board[i - 1][j - 1] == 1) score++;
    if(j > 0 && board[i][j - 1] == 1) score++;
    if(i < m && board[i + 1][j] == 1) score++;
    if(i < m && j < n && board[i + 1][j + 1] == 1) score++;
    if(j < n  && board[i][j + 1] == 1) score++;
    if(i < m && j > 0 && board[i + 1][j - 1] == 1) score++;
    if(i > 0 && j < n && board[i - 1][j + 1] == 1) score++;
    if(score == 3) return 1;
    if(board[i][j] == 1 && score == 2) return 1;
    return 0;
  }
  static void nextPermutation(int[] nums) {
    int i = nums.length - 2;
    int j = nums.length - 1;
    while(i >= 0 && nums[i] >= nums[i +  1]) i--;
    if(i >= 0) {
      while(nums[j] <= nums[i]) j--;
      swap(nums, i, j);
    }
    i++;
    j = nums.length - 1;
    while(i < j) {
      swap(nums, i, j);
      i++;
      j--;
    }
  }
  static void swap(int[] nums, int i, int j) {
    int temp = nums[j];
    nums[j] = nums[i];
    nums[i] = temp;
  }
  static List<String> summaryRanges(int[] nums) {
    List<String> res = new ArrayList<>();
    if(nums.length == 0) return res;
    int start = nums[0], i = 1;
    for(i = 1; i < nums.length; i++) {
      if(nums[i] != nums[i - 1] + 1) {
        if(nums[i - 1] != start) res.add(start + "->" + nums[i-1]);
        else res.add(String.valueOf(start));
        start = nums[i];
      }
    }
    if(nums[i - 1] != start) res.add(start + "->" + nums[i-1]);
    else res.add(String.valueOf(start));
    return res;
  }
  static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> res = new ArrayList<>();
    for(int n : nums) {
        int index = Math.abs(n) - 1;
        if(nums[index] > 0) nums[index] = -nums[index];
    }
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] > 0) res.add(i + 1);
    }
    return res;
  }

  static int[] plusOne(int[] digits) {
    LinkedList<Integer> res = new LinkedList<>();
    int i = digits.length - 1;
    int sum, carry = 1;
    while(i >= 0) {
      sum = digits[i] + carry;
      carry = sum / 10;
      sum = sum % 10;
      res.addFirst(sum);
      i--;
    }
    if(carry > 0) res.addFirst(carry);
    return res.stream().mapToInt(Integer::intValue).toArray();
  }
}
