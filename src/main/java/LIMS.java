import java.util.ArrayList;

/**
Longest monotonic increasing subsequence
*/
public class LIMS {
    public static ArrayList<Integer> find(int[] seq) {
        ArrayList<Integer> res = new ArrayList();
        for (int i = 0; i < seq.length; i++) {
            ArrayList<Integer> curr = new ArrayList<Integer>();
            int previous = seq[i];
            curr.add(seq[i]);
            for (int j = i + 1; j < seq.length; j++) {
                if (seq[j] > previous) {
                    curr.add(seq[j]);
                    previous = seq[j];
                    if (curr.size() > res.size()) {
                        res = curr;
                    }
                }
            }
        }
        if (res.size() == seq.length) {
            res.remove(res.size() - 1);
            return res;
        }
        return res;
    }
    static public int minFlipsMonoIncr(String s) {
      int oneCount = 0;
      int flips = 0;
      for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '1') oneCount++;
        else flips = Math.min(flips + 1, oneCount);
      }
      return flips;
    }
}
