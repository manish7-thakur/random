import java.util.Random;

public class Utils {
  public static int[] randomArray(int length, int lowerBound, int higherBound) {
    int[] arr = new int[length];
    Random rand = new Random();
    for(int i = 0; i < length; i++) {
      arr[i] = rand.nextInt(higherBound - lowerBound) + lowerBound;
    }
    return arr;
  }
}
