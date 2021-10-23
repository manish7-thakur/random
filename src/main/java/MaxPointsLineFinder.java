import java.math.*;
import java.util.*;

public class MaxPointsLineFinder {
  static class Pair<T extends Comparable> {
    T x;
    T y;
    public Pair(T x, T y) {
      this.x = x;
      this.y = y;
    }
    @Override
    public boolean equals(Object other) {
      Pair<T> pOther = (Pair<T>) other;
      return this.x.compareTo(pOther.x) == 0 && this.y.compareTo(pOther.y) == 0;
    }
    @Override
    public int hashCode() {
      return (x + "" + y).hashCode();
    }
  }
  static public int maxPoints(int[][] points) {
    Map<Pair<Integer>, Integer> map = new HashMap<>();
    int result = 1;
    for(int i = 0; i < points.length; i++) {
      map.clear();
      result = Math.max(result, getPointsFor(i, points, map));
    }
    return result;
  }
  static public int getPointsFor(int i, int[][] points, Map<Pair<Integer>, Integer> map) {
    int x1 = points[i][0];
    int y1 = points[i][1];
    int duplicates = 0;
    int maxCount = 0;
    int count = 1;
    for(int j = i + 1; j < points.length; j++) {
      int x2 = points[j][0];
      int y2 = points[j][1];
      if(x1 == x2 && y1 == y2) duplicates++;
      else {
        Pair<Integer> slope = getSlopeCoprime(x1, y1, x2, y2);
        count = map.getOrDefault(slope, 1);
        count++;
        map.put(slope, count);
      }
      maxCount = Math.max(maxCount, count + duplicates);
    }
    return maxCount;
  }
  static Pair<Integer> getSlopeCoprime(int x1, int y1, int x2, int y2) {
    int deltaX = x2 - x1;
    int deltaY = y2 - y1;
    if(deltaX == 0) return new Pair<>(0, 0);
    if(deltaY == 0) return new Pair<>(Integer.MAX_VALUE, Integer.MAX_VALUE);
    if(deltaX < 0) {
      deltaX = -deltaX;
      deltaY = -deltaY;
    }
    int gcd = BigInteger.valueOf(deltaX).gcd(BigInteger.valueOf(deltaY)).intValue();
    return new Pair<>(deltaX / gcd, deltaY / gcd);
  }
}
