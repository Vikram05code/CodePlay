/*Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 */


package com.vikram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(strs);
        System.out.println(groupedAnagrams);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            // Sort the characters of the word to get a canonical representation
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            // Check if the sorted word exists in the map
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            // Add the original word to the list corresponding to the sorted word
            map.get(sortedWord).add(word);
        }
        
        // Convert the map values to a list and return
        return new ArrayList<>(map.values());
    }
}
