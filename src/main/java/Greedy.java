import java.util.*;

public class Greedy {
  /**
  Max work time of any worker.
  jobs = 1, 2, 4, 7, 8
  k = 2
  Output = 11
  w1 - 8 2 1 -> 11
  w2 - 7 4 -> 11
  */
  static int maxWorkTime(int[] jobs, int k) {
    Arrays.sort(jobs);
    int max = 0;
    Queue<Integer> workersQ = new PriorityQueue<>();
    for(int i = 0; i < k; i++) workersQ.add(0);
    for(int j = jobs.length - 1; j >= 0; j--) {
      int job = jobs[j];
      int i = workersQ.remove();
      i += job;
      if(i > max) max = i;
      workersQ.add(i);
    }
    return max;
  }
}
