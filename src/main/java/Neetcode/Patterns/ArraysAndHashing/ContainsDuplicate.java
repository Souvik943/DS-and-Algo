package Neetcode.Patterns.ArraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicate {
    // LC-217
    // Step 1: Create a hashset and iterate through the array
    // Step 2: Add the element in hashset
    // Step 3: Check if both of the sizes are equal or not
    // Step 4: If yes, it means that there is no duplicate-element and return false
    // Step 5: Else return true

    // TC - O(n)
    // SC - O(n)

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : nums) {
            hashSet.add(i);
        }
        return !(hashSet.size() == nums.length);
    }
}
