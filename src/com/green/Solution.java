package com.green;

public class Solution {
    public int[] plusOne(int[] digits) {
            digits[digits.length-1]++;
        for (int i = digits.length-1; i > 0; i-- ){
            if(digits[i]== 10){
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        if(digits[0] == 10){
            int[] digits2 = new int[digits.length+1];
            digits2[0] = 1;
            digits2[1] = 0;
            for(int i=1; i < digits.length; i++){
                digits2[i+1] = digits[i];
            }
            return digits2;
        }
        return digits;
    }
}