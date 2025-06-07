package Compiled.Patterns.SlidingWindow;

public class MaxConsecutiveOnesII {
    public int maxConsecutiveOnesII(int[] nums) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int zeroCount = 0;
        int n = nums.length;
        while(right < n) {
            if(nums[right] == 0) {
                zeroCount++;
            }
            while(zeroCount > 1) {
                if(nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            if(zeroCount <= 1) {
                maxLength = right-left+1;
            }
            right++;
        }
        return maxLength;
    }

}
