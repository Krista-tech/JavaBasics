package main.may3.example;

// Subclass of Animal
public class Dog extends Animal {
    @Override
    void speak() {
        System.out.println(name + " says: Woof!");
    }
}