package Compiled.Patterns.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtmostKDistinct {
    public static int kDistinctChars(int k, String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLength = -1;
        int n = str.length();
        while(right < n) {
            freqMap.put(str.charAt(right), freqMap.getOrDefault(str.charAt(right), 0) + 1);
            while(freqMap.size() > k) {
                char charToBeRemoved = str.charAt(left);
                freqMap.put(charToBeRemoved, freqMap.get(charToBeRemoved) - 1);
                if(freqMap.get(charToBeRemoved) == 0) {
                    freqMap.remove(charToBeRemoved);
                }
                left = left+1;
            }
            if(freqMap.size() == k) {
                maxLength = Math.max(maxLength, right - left +1);
            }
            right = right+1;
        }
        return maxLength;
    }
}
