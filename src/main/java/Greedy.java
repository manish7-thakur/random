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
    int[] workers = new int[k];
    for(int job: jobs) {
      int i = getFreeWorker(workers);
      workers[i] += job;
    }
    return maxWork(workers);
  }
  static int getFreeWorker(int[] workers) {
    int idx = 0;
    int work = workers[idx];
    for(int i = 1; i < workers.length; i++) {
      if(workers[i] < work) {
        idx = i;
        work = workers[i];
      }
    }
    return idx;
  }
  static int maxWork(int[] workers) {
    int maxWork = workers[0];
    for(int i = 1; i < workers.length; i++) {
      if(workers[i] > maxWork) maxWork = workers[i];
    }
    return maxWork;
  }
}
