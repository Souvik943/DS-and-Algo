package Compiled.Patterns.TwoPointers;
//LC : 189
public class RotateArray {
//    TC - O(n)
//    SC - O(1)
//    1. First get the value of k (k can be greater than the size of array) by the formulae : k = k % n
//    2. Reverse the whole array
//    3. Reverse the array from 0 to k-1
//    4. Reverse the array from k to n-1

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k);
        reverse(nums, k+1, n-1);

    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
