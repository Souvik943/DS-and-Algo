package Compiled.Patterns.TwoPointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FourSum {

//    TC - O(n3)
//    SC - O(n)

//    1. Do a necessary check , if the length of array is >= 4 or not
//    2. Define a hashset to store the results
//    3. Initiate a for loop from 0 -> n-3(exclusive)
//            4. Initiate another for loop from i+1 -> n-2
//            5. Initiate a while loop to find the other two and insert them in a hashset.
//            6. Increment the pointers acc to logic
//    7. Return the arrayList(hashSet)

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        HashSet<List<Integer>> hashSet = new HashSet<>();
        if(n < 4) return new ArrayList<>(hashSet);
        for(int i=0; i<n-3; i++) {
            for(int j=i+1; j<n-2; j++) {
                int left = j+1;
                int right = n-1;
                while(left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target) {
                        hashSet.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(hashSet);
    }
}
