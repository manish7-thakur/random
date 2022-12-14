public class NumArray {
  private int[] arr;
  public NumArray(int[] nums) {
    this.arr = new int[nums.length];
    arr[0] = nums[0];
    for(int i = 1; i < arr.length; i++) arr[i] = arr[i - 1] + nums[i];
  }

  public int sumRange(int left, int right) {
    if(left == 0) return arr[right];
    return arr[right] - arr[left - 1];
  }
}
