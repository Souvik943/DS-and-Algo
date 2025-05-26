package Neetcode.Patterns.ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;
//LC : 1
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

//        TC - O(n)
//        SC - O(n)

//        1. Initialise a hashmap , store the currentElement of the array and its index and run a loop for all elements in array
//        2. Calculate the complement of currElement
//        3. If already present , then return the already present index
//        4. If not then add the current element and its index

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
