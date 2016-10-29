package com.digprod;

import java.util.*;

/**
 * Created by dylan on 9/9/16.
 */

public class problem15 {

    private static int matrixDim = 20;

    private static long traverseMatrix(int startX, int startY, Map<List<Integer>, Long> computedValues){

        if (startX == matrixDim || startY == matrixDim) return 1L;

        if (computedValues.containsKey(Arrays.asList(startX, startY)))
            return computedValues.get(Arrays.asList(startX, startY));

        computedValues.put(Arrays.asList(startX+1, startY), traverseMatrix(startX+1, startY, computedValues));
        computedValues.put(Arrays.asList(startX, startY+1), traverseMatrix(startX, startY+1, computedValues));

        long newVal = computedValues.get(Arrays.asList(startX+1, startY)) + computedValues.get(Arrays.asList(startX, startY+1));

        return newVal;
    }

    private static long traverseMatrix(int startX, int startY) {
        if (startX == matrixDim || startY == matrixDim) return 1;

        Map<List<Integer>, Long> computedValues = new HashMap<>();

        return traverseMatrix(startX, startY, computedValues);
    }

    public static long solve() {
        return traverseMatrix(0,0);
    }
}
