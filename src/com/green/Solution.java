package com.green;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> letters = new HashMap();
        int value = 0;
        letters.put("I", 1);
        letters.put("V", 5);
        letters.put("X", 10);
        letters.put("L", 50);
        letters.put("C", 100);
        letters.put("D", 500);
        letters.put("M", 1000);
        System.out.println(letters);
        String[] romans = s.split("");
        for (String roman : romans) {
            value += letters.get(roman);
        }
        for (int i=1; i<romans.length; i++){
            if(romans[i-1].equals("I") && romans[i].equals("V") || romans[i-1].equals("I") && romans[i].equals("X") || romans[i-1].equals("X") && romans[i].equals("L") || romans[i-1].equals("X") && romans[i].equals("C") || romans[i-1].equals("C") && romans[i].equals("D") || romans[i-1].equals("C") && romans[i].equals("M")){
                value = value - (2 * letters.get(romans[i -1]));
            }
        }
        return value;
    }
}