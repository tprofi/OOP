package com.javalesson.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandligMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter numerator");
            int numerator = scanner.nextInt();
            System.out.println("Please enter dominator");
            int dominator = scanner.nextInt();

            System.out.println(divide(numerator, dominator));
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
            scanner.nextLine();
            System.out.println("Enter only non zero parameters allowed");
        } catch (InputMismatchException e){
            System.out.println("Exception: "+e);
            scanner.nextLine();
            System.out.println("Only integer allowed");
        }
    }

    private static int divide(int numerator, int dominator) {
        return numerator / dominator;
    }

}
