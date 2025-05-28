package Neetcode.Patterns.ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//LC : 49
public class GroupAnagrams {

//    TC - O(n)
//    SC - O(n)
//    1. Use a hashmap , which will store the string's hashcode as key and all the strings that form that speciifc hashcode as values
//    2. We iterate through the array of strings and go through it , if hashcode is not present we just add it and if already present , we just create alist of all the strings with that hashcode
//    3. We return the hashmap's values .

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(String str : strs) {
            String keyString = modifyString(str);
            hashMap.putIfAbsent(keyString, new ArrayList<>());
            hashMap.get(keyString).add(str);
        }
        return new ArrayList<>(hashMap.values());
    }

    public String modifyString(String str) {
        int[] hashArray = new int[26];
        for(int i=0; i<str.length(); i++) {
            hashArray[str.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char c = 'a';
        for(int i : hashArray) {
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();
    }
}
