package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class W01_TwoSumHashMap {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i ++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) return new int[]{i, complementIndex};
            complements.put(target - nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(W01_TwoSum.twoSum(nums, target)));
    }
}
