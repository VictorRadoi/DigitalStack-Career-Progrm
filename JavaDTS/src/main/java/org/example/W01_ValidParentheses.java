package org.example;

public class W01_ValidParentheses {
    public boolean isValid(String s) {
        char[] sArray = s.toCharArray();
        for (int i = 0; i< sArray.length - 1; i++) {
            if (sArray[i] != sArray[i+1]) return false;
        }
        return true;
    }
}