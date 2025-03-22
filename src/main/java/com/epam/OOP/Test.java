package com.epam.OOP;

public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println(bird.getDescription()); // Bird class will use overridden method.
        System.out.println(dog.getDescription()); // Dog class will use method from Animal class.
    }
}
