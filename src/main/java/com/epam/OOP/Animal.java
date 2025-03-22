package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String colour, int numberOfPaws, boolean hasFur) {
        this.color = colour;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pawWord = (numberOfPaws == 1) ? "paw" : "paws";
        String furWord = hasFur ? "a" : "no";

        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWord +
                " and " + furWord + " fur.";
    }
}
