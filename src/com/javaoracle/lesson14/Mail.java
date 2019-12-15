package com.javaoracle.lesson14;

public class Mail {

    public void email(String s){
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < s.length() - 1) {
            a= s.indexOf('@');
            b= s.indexOf('.');
            c= s.indexOf(';');
            System.out.println(s.substring(a+1, b));
        }
    }

}
