package com.javalesson.oop;

public class Main {
    public static void main (String[] args) {


        Dog doberman = new Dog();
        doberman.setSize(Size.VERY_SMALL);
        doberman.setName("Фил");
        doberman.setBreed("Doberman");
        doberman.bark();

        Dog Lab = new Dog();
        Lab.setName("Charlie");
        Lab.setBreed("Lab");
        Lab.setSize(Size.AVERAGE);
        Lab.bark();

        Dog Sheppard = new Dog();
        Sheppard.setBreed("Sheppard");
        Sheppard.setName("Mike");
        Sheppard.setSize(Size.SMALL);
        Sheppard.bark();

        Dog Skotina = new Dog();
        Skotina.setName("Andrey");
        Skotina.setBreed("TehExpert");
        Skotina.setSize(Size.TEHEXPERT);
        Skotina.bark();

        Skotina.bite();

//        Size s =Size.SMALL;
//        System.out.println(s);
//        Size s1 = Size.valueOf("BIG");
//        System.out.println(s1);

        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

    }


}
