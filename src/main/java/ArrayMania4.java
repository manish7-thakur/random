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
    int r = nums.length - 1;
    int l = r - 1;
    boolean jumpOut = false;
    while(r >= 0) {
      for(l = r - 1; l >= 0; l--) {
        if(nums[r] > nums[l]) {
          jumpOut = true;
          break;
        }
      }
      if(jumpOut) break;
      r--;
    }
    if(r >= 0 && l >= 0 && nums[r] > nums[l]) {
      int n = nums[r];
      while(r > l) {
        nums[r] = nums[r - 1];
        r--;
      }
      nums[r] = n;
      return;
    }
    l = 0; r = nums.length - 1;
    while(l < r) {
      int temp = nums[r];
      nums[r] = nums[l];
      nums[l] = temp;
      l++;
      r--;
    }
  }
}
