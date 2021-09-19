public class UnpairedNumberFinder {
  public static int find(int[] arr) {
    int acc = arr[0];
    for(int i = 1; i < arr.length; i++) {
      acc ^= arr[i];
    }
    return acc;
  }
}
