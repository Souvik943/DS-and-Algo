package Compiled.Patterns.SlidingWindow;

public class MaxConsecutiveOnesIII {
//    TC - O(n)
//    SC - O(1)
//
//    1. We maintain left , right , zeroCount and maxLength variables
//    2. We run a loop while(right < n)
//        3. If we get a zero , we do zeroCount++
//        // Here comes a situation , when the zerCount is > k , so we need to reduce the count of zeroes , from the left side
//
//        4. Run a loop - while(zeroCount > k)
//            5. If(nums[left] == 0) do zerCount--
//            6. left++
//        7. If (zeroCount <= k) calculate and compare the maxLength
//        8. right++
//    9. Return maxLength;

    public int longestOnes(int[] nums, int k) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int zeroCount = 0;
        int n = nums.length;
        while(right < n) {
            if(nums[right] == 0) {
                zeroCount++;
            }
            while(zeroCount > k) {
                if(nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            if(zeroCount <= k) {
                maxLength = Math.max(maxLength, right-left+1);
            }
            right++;
        }
        return maxLength;
    }
}
