package org.example;

import java.util.Arrays;

public class W01_ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int count = 0;
        if (sArray.length != tArray.length) return false;
        else {
            Arrays.sort(sArray);
            Arrays.sort(tArray);

            return Arrays.equals(sArray, tArray);
        }
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s1, t1));
        System.out.println(isAnagram(s2, t2));
    }
}
