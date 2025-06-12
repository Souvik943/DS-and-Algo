package Compiled.Patterns.ArraysAndHashing;

import java.util.Arrays;

public class MaxDiffBetweenOddAndEvenFreq {
    public static int maxDifference(String s) {
        int[] hashArray = new int[26];
        for(char c : s.toCharArray()) {
            hashArray[c-'a']++;
        }
        int oddMax = 0;
        int evenMin = 0;
        Arrays.sort(hashArray);
        for (int j : hashArray) {
            if (j != 0 && j % 2 == 0) {
                evenMin = j;
                break;
            }
        }
        for(int i=hashArray.length-1; i>=0; i--) {
            if(hashArray[i] !=0 && hashArray[i] %2 != 0) {
                oddMax = hashArray[i];
                break;
            }
        }
        return oddMax - evenMin;
    }

    public static void main(String[] args) {
        System.out.println(maxDifference("abcabcab"));
    }
}
