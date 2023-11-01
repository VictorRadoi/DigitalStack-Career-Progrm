package org.example;

public class W01_NumberOfGoodPairs {
    public static int numericalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] array = {4, 4, 4, 4};
        int[] array2 = {1, 2, 3, 4, 1};
        System.out.println(numericalPairs(array));
        System.out.println(numericalPairs(array2));
    }
}
