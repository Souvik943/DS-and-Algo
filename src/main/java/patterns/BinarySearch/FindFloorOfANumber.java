package patterns.BinarySearch;

public class FindFloorOfANumber {
    private static int findFloor(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] <= target) {
                index = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return index;
    }
}
