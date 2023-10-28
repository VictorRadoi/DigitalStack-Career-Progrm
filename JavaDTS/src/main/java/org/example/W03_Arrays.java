package org.example;

public class W03_Arrays {
    public static boolean containsDuplicate(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) { // Change i++ to j++
                if (numbers[i] == numbers[j]) { // Change numbers[2] to numbers[j]
                    return true;
                }
            }
        }
        return false; // You should return false if no duplicates are found
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 4, 5};
        int[] array2 = {1, 2, 3, 4, 1};
        System.out.println(containsDuplicate(array));
        System.out.println(containsDuplicate(array2));
    }
}

