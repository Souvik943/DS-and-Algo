package Compiled.Patterns.ArraysAndHashing;
//LC : 31
public class NextPermutation {
//    1. We maintain 2 variables i = n-2 and j = n-1
//    2. We run a loop , till i >= 0 && nums[i] >= nums[i+1] and do i--;
//    3. If i >= 0 {this condition is when numbers are like this : 54321}
//    // Now we check the next greater element than pivot
//            1. We run a loop , till nums[j] <= nums[i] and do j--
//            2. After we get the next greater element , we just swap the elemts at i and j
//    4. Now we reverse , starting from index i+1 and till the end of array

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        int j = n-1;
        while(i>=0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if(i>=0) {
            while(nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int index) {
        int end = nums.length-1;
        int start = index;
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = nums[start];
        }
    }
}
