import java.util.*;
public class FirstMissingPositiveFinder {
  public static int find(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != i+1) {
        int curr = arr[arr[i]-1];
        arr[arr[i]-1] = arr[i];
        arr[i] = 0;
        while(curr > 0 && curr <= arr.length && arr[curr - 1] != curr) {
          int temp = arr[curr - 1];
          arr[curr - 1] = curr;
          curr = temp;
        }
      } else if(arr[i] < 0 || arr[i] > arr.length) {
        arr[i] = 0;
      }
    }
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == 0) {
        return i + 1;
      }
    }
    return arr.length + 1;
  }
}
