package Compiled.Patterns.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MaxErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int maxScore = 0;
        int currSum = 0;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        while(right < n) {
            while(set.contains(nums[right])) {
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            currSum += nums[right];
            maxScore = Math.max(maxScore, currSum);
            right++;
        }
        return maxScore;
    }
}
