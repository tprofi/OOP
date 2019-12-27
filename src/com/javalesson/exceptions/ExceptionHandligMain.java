package com.javalesson.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandligMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueloop = true;
        do {
            try {
                System.out.println("Please enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter dominator");
                int dominator = scanner.nextInt();
                System.out.println("Result is = " + divide(numerator, dominator));
                continueloop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception: " + e);
                scanner.nextLine();
                System.out.println("Enter only integer non zero parameters allowed");
            }
            System.out.println("Try-catch block finished");
        } while (continueloop);
    }

    private static int divide(int numerator, int dominator) throws ArithmeticException, NullPointerException, InputMismatchException {
        return numerator / dominator;
    }

    private static void sveToFile(int res) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("AndreyKek"));
        writer.println("Result is "+res);
    }

}
