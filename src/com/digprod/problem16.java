package com.digprod;

import java.math.BigDecimal;

/**
 * Created by dylan on 9/9/16.
 */
public class problem16 {

    public static long solve() {

        long sum = 0L;

        BigDecimal bigNum = new BigDecimal("2");
        String numStr = "" + bigNum.pow(1000);

        for (char num : numStr.toCharArray()) {
            sum += Character.getNumericValue(num);
        }

        return sum;
    }
}
