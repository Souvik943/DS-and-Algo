package patterns.BinarySearch;

public class SearchInAnInfiniteSortedArray {
    private static int findIndex(int num[], int target) {
        int start = 0;
        int end = 1;
        while(num[end] < target) {
            start = end;
            end = end * 2;
        }
        return binarySearch(start, end, num, target);
    }

    private static int binarySearch(int start, int end, int[] nums, int target) {
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
