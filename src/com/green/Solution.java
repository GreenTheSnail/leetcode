package com.green;

public class Solution {
    public int maxProfit(int[] prices) {
    int profit = 0;
    for(int i = 0; i< prices.length-1; i++){
        for (int z = i+1; z< prices.length; z++){
            int prof = prices[z] - prices[i];
            if(prof > profit){
                profit = prof;
            }
        }
    }

    return profit;
    }
}