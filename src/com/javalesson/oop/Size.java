package com.javalesson.oop;

enum Size {
    VERY_SMALL("XS"), SMALL("S"), AVERAGE("M"), BIG("L"), VERY_BIG("XL"), UNDEFIND(""), TEHEXPERT("T");

    Size (String abbreviation) {
        this.abbreveation = abbreviation;
    }

    private String abbreveation;

    public String getAbbreveation () {
        return abbreveation;
    }
}
