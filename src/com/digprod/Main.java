package com.digprod;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long solution = problem17.solve();

        System.out.println(solution);

        long dt = System.currentTimeMillis() - startTime;
        System.out.println("Execution took " + (double)dt * 0.001D + " seconds");

    }
}
