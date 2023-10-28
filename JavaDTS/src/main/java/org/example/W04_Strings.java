package org.example;

public class W04_Strings {
    public static void reverseString(char[] string) {
        int left = 0;
        int right = string.length - 1;

        while (left < right) {
            char temp = string[left];
            string[left] = string[right];
            string[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};

        reverseString(s1);
        System.out.println(s1);
        reverseString(s2);
        System.out.println(s2);
    }
}
