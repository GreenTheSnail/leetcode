package com.green;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] rt = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int y = 1 + i; y < nums.length; y++) {
                if (nums[i] + nums[y] == target) {
                    rt[0] = i;
                    rt[1] = y;

                }
            }
        }
        return rt;
    }
}
