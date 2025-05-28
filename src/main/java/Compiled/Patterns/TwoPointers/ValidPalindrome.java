package Compiled.Patterns.TwoPointers;
//LC : 125
public class ValidPalindrome {
//    TC - O(n)
//    SC - O(n)
//    1. We sanitize the string using replaceAll("[^A-Za-z0-9]","")
//    2. Now apply two pointer to check if the characters are same or not.

    public boolean isPalindrome(String s) {
        String sanitisedString = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int start = 0;
        int end = sanitisedString.length()-1;
        while(start < end) {
            if(sanitisedString.charAt(start) != sanitisedString.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
