package com.green;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int x = -1;
        for (int i=0; i<nums.length; i++){
            if(nums[i]==target){
                x=i;
            }
        }
        if(x==-1){
            x=0;
            for (int i=0; i<nums.length; i++){
                if(nums[i]<target){
                    x = i+1;
                }
            }
        }
        return x;
    }
}