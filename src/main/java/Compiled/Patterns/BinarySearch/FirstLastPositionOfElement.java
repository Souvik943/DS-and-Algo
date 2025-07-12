package Compiled.Patterns.BinarySearch;

//LeetCode : 34 : Find First and Last Position of Element in Sorted Array

public class FirstLastPositionOfElement {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirstOccurence(nums, target), findLastOccurence(nums, target)};
    }

    public int findFirstOccurence(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int res = -1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(nums[mid] == target) {
                res = mid;
                right = mid-1;
            } else if(nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return res;
    }

    public int findLastOccurence(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int res = -1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(nums[mid] == target) {
                res = mid;
                left = mid+1;
            } else if(nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return res;
    }
}
