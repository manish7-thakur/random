public class NumArray {
  private int[] arr;
  public NumArray(int[] arr) {
    this.arr = arr;
  }
  public void update(int idx, int val) {
    arr[idx] = val;
  }
  public int sumRange(int left, int right) {
    int sum = 0;
    while(left <= right){
      sum += arr[left];
      left++;
    }
    return sum;
  }
}
