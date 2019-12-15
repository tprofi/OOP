package com.javaoracle.lesson14;

public class TestTime {

    static void time() {
        OUTER:
         for (int chas = 0; chas <= 23; chas++) {
            for (int minuta = 0; minuta <= 59; minuta++) {
                System.out.println(chas + ":" + minuta);
                if (minuta==20) break OUTER;
            }
        }
    }
}
