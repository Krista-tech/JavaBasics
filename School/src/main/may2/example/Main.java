package main.may2.example;

/**
 * This is the main class that demonstrates how to use the Dog class.
 * It creates an instance of Dog and calls its methods.
 */
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";

        myDog.speak(); // Inherited from Animal
        myDog.fetch(); // Unique to Dog
    }
}