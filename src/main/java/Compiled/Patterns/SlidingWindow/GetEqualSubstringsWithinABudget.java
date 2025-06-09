package Compiled.Patterns.SlidingWindow;

public class GetEqualSubstringsWithinABudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int n = s.length();
        int charDifference = 0;
        if(s.length() != t.length()) return maxLength;
        while(right < n) {
             charDifference += Math.abs(s.charAt(right) - t.charAt(right));
             while(charDifference > maxCost) {
                 charDifference -= Math.abs(s.charAt(left) - t.charAt(left));
                 left++;
             }
             maxLength = Math.max(maxLength, right-left+1);
             right++;
        }
        return maxLength;
    }
}
