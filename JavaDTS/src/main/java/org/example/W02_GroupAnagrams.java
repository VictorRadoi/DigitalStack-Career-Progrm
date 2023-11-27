package org.example;

import java.util.*;

public class W02_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> storage = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            storage.putIfAbsent(sortedWord, new ArrayList<>());
            storage.get(sortedWord).add(word);
        }
        return new ArrayList<>(storage.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(Arrays.toString(new List[]{W02_GroupAnagrams.groupAnagrams(strs)}));
    }
}
