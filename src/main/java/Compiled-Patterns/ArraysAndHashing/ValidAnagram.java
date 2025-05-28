package Neetcode.Patterns.ArraysAndHashing;

import java.util.Arrays;
//LC : 242
public class ValidAnagram {
//    ----------------------------  Naive Solution  ----------------------------
//    public boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()) return false;
//        char[] sCharArray = s.toCharArray();
//        char[] tCharArray = t.toCharArray();
//        Arrays.sort(sCharArray);
//        Arrays.sort(tCharArray);
//        for(int i=0; i<sCharArray.length; i++) {
//            if(sCharArray[i] != tCharArray[i]) return false;
//        }
//        return true;
//    }

//    -----------------------------  Optimised approach  ------------------------

//    1. Create a hashArray of size 26 , which store the character's value as index .
//    2. We iterate through the first string and store the number of times the character appears and increment the count
//    3. We iterate through the next string and decrement the value of the character
//    4. We check if the hashArray contains any value other than 0 , if yes then return false , else return true

//    TC - O(n)
//    SC - O(26)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] charArray = new char[26];
        for (char c : s.toCharArray()) {
            charArray[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            charArray[c - 'a']--;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != 0) return false;
        }
        return true;
    }
}
