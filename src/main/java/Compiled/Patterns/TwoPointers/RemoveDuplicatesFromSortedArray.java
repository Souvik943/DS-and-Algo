package Compiled.Patterns.TwoPointers;

public class RemoveDuplicatesFromSortedArray {
    TC - O(n)
    SC - O(1)

    1. Define an index = 1 (because the first element will always be unique , so start from the 1th index)
    2. We run a loop starting from i = 1
        3. We check if :
            4.
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                nums[index] = nums[i-1];
                index++;
            }
        }
        return index;
    }
}
