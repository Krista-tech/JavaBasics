package main.may3.example;

// Subclass of Animal
public class Cat extends Animal {
    @Override
    void speak() {
        System.out.println(name + " says: Meow!");
    }
}