public class RotatedSortedMinFinder {
  static public int findMin(int[] nums) {
    return binarySearch(nums, 0 , nums.length - 1);
  }
  static int binarySearch(int[] nums, int l, int h) {
    while(l < h) {
      int mid = (l + h) / 2;
      if(mid + 1 < nums.length && nums[mid] < nums[mid + 1] && mid - 1 >= 0 && nums[mid] < nums[mid - 1]) return nums[mid];
      else return Math.min(binarySearch(nums, l, mid - 1), binarySearch(nums, mid + 1, h));
    }
    return nums[l];
  }
}
