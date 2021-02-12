package com.green;

public class Solution {
    public int lengthOfLastWord(String s) {
        int x = 0;
    String[] words = s.split(" ");
    if(words.length != 0){
    x = words[words.length-1].length();
    }
        return x;
    }
}