import java.util.*;
import static java.util.stream.Collectors.toList;

public class Skyliner {
  static class Point implements Comparable<Point> {
    int x;
    int h;
    public Point(int x, int h) {
      this.x = x;
      this.h = h;
    }
    @Override
    public int compareTo(Point other) {
      if(this.x != other.x) return this.x - other.x;
      return this.h - other.h;
    }
  }

  static public List<List<Integer>> getSkyline(int[][] buildings) {
    List<List<Integer>> res = new ArrayList<>();
    List<Point> points = new ArrayList<>();
    for(int[] arr: buildings) {
      int x = arr[0]; //start
      int y = arr[1]; //end
      int h = arr[2]; //height
      points.add(new Point(x, -h));
      points.add(new Point(y, h));
    }
    Collections.sort(points);
    Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    int currHeight = 0; // initial height is 0
    queue.add(currHeight); // zero height initilization
    for(Point p : points) {
      if(p.h < 0) queue.add(-p.h); //start of building
      else queue.remove(p.h); // end of building
      if(queue.peek() != currHeight) {
        res.add(Arrays.asList(p.x, queue.peek()));
        currHeight = queue.peek();
      }
    }
    return res;
  }
}
