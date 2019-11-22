package com.javalesson.oop;

import java.util.Scanner;

public class Dog {

    private static int dogsCount;

    private static final int PAWS = 4;
    private static final int TAIL = 1;
    private String name;
    private Size size = Size.UNDEFIND;
    private String Breed;

    public Dog () {
        dogsCount++;
        System.out.println(dogsCount);
    }


    public static int getDogsCount () {
        return dogsCount;
    }

    public String getBreed () {
        return Breed;
    }

    public void setBreed (String breed) {
        Breed = breed;
    }


    public void setName (String name) {
        Scanner s = new Scanner(System.in);
        name = s.toString();
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public Size getSize () {
        return size;
    }

    public void setSize (Size size) {
        this.size = size;
    }


    public void bark () {
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Waf-waf");
                break;
            case AVERAGE:
                System.out.println("taf-taf");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("tiaf -tiaf");
                break;
            case TEHEXPERT:
                System.out.println("Welcome to Alcoservice");
                break;
            default:
                System.out.println("Undefind");

        }

    }

    void bite () {
        if (dogsCount > 2) {
            System.out.println("Dogs is biting you");
        } else {
            bark();
        }
    }

}