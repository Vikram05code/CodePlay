package com.vikram;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longestSubstringLength = 0;
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0;
        
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                longestSubstringLength = Math.max(longestSubstringLength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        
        return longestSubstringLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        int length = solution.lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}