package com.javaoracle.lesson14;

import java.util.Scanner;

public class Mail {
    private String m;

    public Mail() {
        this.m = insEmail();
    }


     void domen() {

        int a = m.indexOf('@');
        int b = m.length();
        System.out.println("Domen is " + m.substring(a + 1, b));

    }

    private String insEmail() {
        System.out.print("Please insert your email: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
