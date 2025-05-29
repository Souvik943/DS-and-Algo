package Compiled.Patterns.TwoPointers;

import java.util.*;
//LC : 15
public class ThreeSum {
//    TC : O(nlogn) + O(n2)
//    SC : O(n)

//    1. Sort the nums array
//    2. Run a loop , from the first index to last
//        3. Now , we choose a start index = i+1 and end = n-1
//        4. Run a while loop , till start < end
//            5. Calculate the sum of index i , start and end
//                6. If they equal to 0 , then add it into a set and do start++ and end--
//                7. Else If sum > 0 , then we need to end--
//                8. Else do start++
//    9. Return new ArrayList(set)

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            int start = i+1;
            int end = n-1;
            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0) {
                    set.add(Arrays.asList(i, start, end));
                } else if(sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
