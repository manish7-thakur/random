import java.util.*;

public class NetworkRankFinder {
  static public int maximalNetworkRank(int n, int[][] roads) {
    int[] nMap = new int[n];
    Set<String> pairs = new HashSet<>();
    for(int i = 0; i < roads.length; i++) {
      nMap[roads[i][0]]++;
      nMap[roads[i][1]]++;
      pairs.add(roads[i][0] + "" + roads[i][1]);
    }

    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int r1 = -1;
    int r2 = -1;
    for(int i = 0; i < n; i++) {
      if(nMap[i] > max1) {
        max2 = max1;
        r2 = r1;
        max1 = nMap[i];
        r1 = i;
      } else if(nMap[i] > max2) {
        max2 = nMap[i];
        r2 = i;
      } else if(nMap[i] == max1 && !pairs.contains(i+""+r2) &&  !pairs.contains(r2 + "" + i)) {
        max1 = nMap[i];
        r1 = i;
      } else if(nMap[i] == max2 && !pairs.contains(i+""+r1) &&  !pairs.contains(r1 + "" + i)) {
        max2 = nMap[i];
        r2 = i;
      }
    }
    if(pairs.contains(r1 + "" + r2) || pairs.contains(r2 + "" +r1))
    return max1 + max2 - 1;
    else return max1 + max2;
  }
}
