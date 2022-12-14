public class NumArray {
  private int[] arr;
  public NumArray(int[] input) {
    this.arr = new int[input.length];
    arr[0] = input[0];
    for(int i = 1; i < arr.length; i++) arr[i] = arr[i - 1] + input[i];
  }

  public int sumRange(int left, int right) {
    if(left == 0) return arr[right];
    return arr[right] - arr[left - 1];
  }
}
