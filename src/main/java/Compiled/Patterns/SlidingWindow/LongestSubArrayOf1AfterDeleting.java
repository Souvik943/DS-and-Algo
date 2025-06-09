package Compiled.Patterns.SlidingWindow;

public class LongestSubArrayOf1AfterDeleting {
    public int longestSubarray(int[] nums) {
        int count1 = 0;
        int count0 = 0;
        for(int i : nums) {
            if(i == 1) count1++;
        }
        if(count1 == nums.length) return count1 - 1;
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while(right < nums.length) {
            if(nums[right] == 0) count0++;
            while(count0 > 1) {
                if(nums[left] == 0) {
                    count0--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right-left);
            right++;
        }
        return maxLength;
    }
}
