package com.green;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3,3};

        int[] luls = solution.twoSum(arr, 6);

       for(int lul: luls){
           System.out.println(lul);
       }
    }
}
