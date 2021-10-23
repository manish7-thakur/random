public class RotatedSortedMinFinder {
  static public int findMin(int[] nums) {
    return binarySearch(nums, 0 , nums.length - 1);
  }

  static int binarySearch(int[] nums, int l, int h) {
    while(l < h) {
      int mid = (l + h) / 2;
      if(nums[mid] < nums[h]) h = mid;
      else if(nums[mid] > nums[h]) l = mid + 1;
      else h--;
    }
    return nums[l];
  }
}
