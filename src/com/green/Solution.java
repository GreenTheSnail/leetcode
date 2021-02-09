package com.green;

public class Solution {
    public boolean isPalindrome(int x) {
          boolean bol = false;
          String[] nums = Integer.toString(x).split("");
          if(nums.length == 1){
              bol = true;
          }else {
              for (int i = 0; i < (nums.length / 2); i++) {
                  if (nums[i].equals(nums[nums.length - i - 1])) {
                      bol = true;
                  } else {
                      bol = false;
                      break;
                  }
              }
          }
        return bol;
    }
}