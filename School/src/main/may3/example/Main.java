package main.may3.example;

public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.name = "Luna";

        Animal myDog = new Dog();
        myDog.name = "Buddy";

        myCat.speak();  // Luna says: Meow!
        myDog.speak();  // Buddy says: Woof!
    }
}