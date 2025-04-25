package patterns.BinarySearch;

public class FindFirstandLastOccurence {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findFirstOccurence(nums, target);
        res[1] = findLastOccurence(nums, target);
        return res;
    }

    private int findFirstOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end) {
            int mid = start + (end-start) / 2;
            if(nums[mid] == target) {
                index = mid;
                end = mid-1;
            } else if(nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return index;
    }

    private int findLastOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end) {
            int mid = start + (end-start) / 2;
            if(nums[mid] == target) {
                index = mid;
                start = mid+1;
            } else if(nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return index;
    }
}
