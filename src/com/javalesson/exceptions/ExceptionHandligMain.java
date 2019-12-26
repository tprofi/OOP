package com.javalesson.exceptions;

public class ExceptionHandligMain {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    private static int divide(int numerator, int dominator) {
        return numerator / dominator;
    }

}
