package Compiled.Patterns.ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;
//LC : 128
public class LongestCommonSubsequence {

//    TC - O(n)
//    SC - O(n)
//1. Maintain a maxLength variable
//2. Store all elements to set
//3. Iterate through set
//4. Check :
//    - For a single element in the set , we need to :
//    - If its prev number is not in the set , then
//    - we need to check further that if its next number is present in the set , If yes , then we count the length .
//    - We maintain a while loop , till the set contains the next elemet for current element and increase the count accordingly .
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;
        for(int i : nums) {
            set.add(i);
        }
        for(int i : set) {
            if(!set.contains(i-1)) {
                int currentValue = i;
                int currentLength = 1;
                while(set.contains(currentValue + 1)) {
                    currentValue++;
                    currentLength++;
                }
                maxLength = Math.max(currentLength, maxLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
