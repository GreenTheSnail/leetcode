package com.green;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1};
        int target = 2;
        int x =solution.searchInsert(nums, target);
        System.out.println(x);
    }
    }

