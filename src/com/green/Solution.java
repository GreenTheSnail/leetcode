package com.green;

import java.util.Arrays;

public class Solution {
    public int reverse(int x) {

        if (x == 0) {
            return 0;
        }
        int o2 = 0;

        String[] stroks = Integer.toString(x).split("");
        String[] stroks2 = new String[stroks.length];
        for (int i = 0; i < stroks.length; i++) {
            stroks2[i] = stroks[stroks.length - i - 1];
        }
        if (x > 0) {
            String o = Arrays.toString(stroks2).replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
            if (Double.parseDouble(o) > 2147483647) {
                return 0;
            } else {
                o2 = Integer.parseInt(o);
            }
        }
        if (x < 0) {
            String o = Arrays.toString(stroks2).replace("-", "").replace(",", "").replace("[", "-").replace("]", "").replace(" ", "");
            if (Double.parseDouble(o) > 2147483647 || Double.parseDouble(o) < -2147483648) {
                return 0;
            } else {
                o2 = Integer.parseInt(o);
            }
        }
        return o2;
    }
}
