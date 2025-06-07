package Compiled.Patterns.SlidingWindow;

public class SubArrayProductLessThanK {
//    TC - O(n)
//    SC - O(1)
//    1. We check , if k <= 1 , then we return 0
//    2. Maintain left, right , countSubArrays , product = 1
//    3. Run a loop (right < n)
//        - Calculate the prodcut *= nums[right]
//        - Check and Run a loop till product>=k
//            - Shrink the window , by dividing the number from the left from the product
//            - left++
//            - Calculate the subarrays = right-left+1
//        - right++
//    4. Return countOfSubArrays

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int left = 0;
        int right = 0;
        int count = 0;
        int product = 1;
        while(right < nums.length) {
            product *= nums[right];
            if(product >= k) {
                product /= nums[left];
                left++;
            }
            count += right - left +1;
            right++;
        }
        return count;
    }
}
