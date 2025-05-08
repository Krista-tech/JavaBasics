package main.may2.example;

/**
 * This is the subclass (or child class) called Dog.
 * It inherits properties and behaviors from the Animal class.
 * The Dog class can also have its own unique properties and behaviors.
 * In this case, it has a method called fetch() that is specific to dogs.
 */

public class Dog extends Animal {

    void fetch() {
        System.out.println(name + " is fetching a ball!");
    }
}