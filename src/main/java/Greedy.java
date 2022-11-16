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
    for(int i = jobs.length - 1; i >= 0; i--) {
      int job = jobs[i];
      int jobTime = workersQ.remove();
      jobTime += job;
      if(jobTime > max) max = jobTime;
      workersQ.add(jobTime);
    }
    return max;
  }

  static int leastInterval(char[] tasks, int n) {
    int numTasks = tasks.length;
    int max = 0, e = 0;
    Map<Character, Integer> map = new HashMap<>();
    for(char c : tasks) {
      int count = map.merge(c, 1, Integer::sum);
      if(count > max) max = count;
    }
    for(Map.Entry<Character, Integer> entry : map.entrySet()) {
      if(entry.getValue() == max) e++;
    }
    return Math.max(numTasks, (max - 1) * (n + 1) + e);
  }
  static int findContentChildren(int[] g, int[] s) {
    int res = 0, j = 0;
    Arrays.sort(g);
    Arrays.sort(s);
    for(int i = 0; i < s.length && j < g.length; i++) {
      if(s[i] >= g[j]) {
        j++;
        res++;
      }
    }
    return res;
  }
}
