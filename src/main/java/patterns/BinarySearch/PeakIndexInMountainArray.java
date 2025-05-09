package patterns.BinarySearch;

public class PeakIndexInMountainArray {
    private static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                return mid;
            } else if(nums[mid] > nums[mid-1]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
