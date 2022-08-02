import java.util.*;

public class ArrayMania4 {
  static void gameOfLife(int[][] board) {
    // List<Pair> queue = new LinkedList<>();
    for(int i = 0; i < board.length; i++) {
      for(int j = 0; j < board[0].length; j++) {
        int fate = getScore(board, i, j);
        if(fate != board[i][j]) {
          board[i][j] = fate;
        }
      }
    }
  }
  static int getScore(int[][] board, int i, int j) {
    return 0;
  }
}
