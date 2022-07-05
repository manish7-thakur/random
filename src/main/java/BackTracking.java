import java.util.*;

public class BackTracking {
  static List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<>();
    generateRec(res, "", n, 0, 0);
    return res;
  }
  static void generateRec(List<String> res, String curr, int n, int opened, int closed) {
    if(curr.length() == n * 2) {
      res.add(curr);
      return;
    }
    if(opened < n) generateRec(res, curr + "(", n, opened + 1, closed);
    if(closed < opened) generateRec(res, curr + ")", n, opened, closed + 1);
  }
}
