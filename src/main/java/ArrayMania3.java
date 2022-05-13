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
      if(num2 == n) c2++;
    }
    if(c1 > majMark) res.add(num1);
    if(c2 > majMark) res.add(num2);
    return res;
  }
}
