package Compiled.Patterns.SlidingWindow;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingChars {
//    TC - O(n)
//    SC - O(256)
//
//    1. We maintain two pointers left and right starting from 0
//    2. We create a hashArray(256) initially -1 , which will contain the index of last seen character
//    3. We run a loop , while(right < n)
//        4. If the character is already present in hashArray
//            5. If the last index of the character(present in hashArray) >= left (means its a valid window)
//                6. We move the left pointer to (the index present in hashArray) + 1
//        7. Now calculate and compare the maxLength
//        8. Add the right pointer to the hashArray
//        9. right++
//    10 . return maxLength

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] hashArray = new int[256];
        Arrays.fill(hashArray, -1);
        int maxLength = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        while(right < n) {
            if(hashArray[s.charAt(right)] != -1) {
                if(hashArray[s.charAt(right)] >= left) {
                    left = hashArray[s.charAt(right)] + 1;
                }
            }
            maxLength = Math.max(maxLength, right-left+1);
            hashArray[s.charAt(right)] = right;
            right++;
        }
        return maxLength;
    }
}
