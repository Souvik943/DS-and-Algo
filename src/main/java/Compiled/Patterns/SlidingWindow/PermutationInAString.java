package Compiled.Patterns.SlidingWindow;

import java.util.Arrays;

public class PermutationInAString {
    public boolean checkInclusion(String s1, String s2) {
        int[] hash1 = createHash(s1);
        int left = 0;
        int right = s1.length()-1;
        while(right < s2.length()) {
            int[] hash2 = createHash(s2.substring(left, right+1));
            if(Arrays.equals(hash1, hash2)) return true;
            left++;
            right++;
        }
        return false;
    }

    public int[] createHash(String str) {
        int[] hash = new int[26];
        for(char c : str.toCharArray()) {
            hash[c-'a']++;
        }
        return hash;
    }

    public static void main(String[] args) {
        PermutationInAString permutationInAString = new PermutationInAString();
        System.out.println(permutationInAString.checkInclusion("adc", "dcda"));
    }
}
