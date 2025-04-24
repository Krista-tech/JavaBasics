package main.apr_may.example;


/** Class: A blueprint (like a recipe).
 * It contains two fields (variables) and one method (function).
 **/
class Car {
    String brand; // Field to store the brand of the car
    int speed; // Field to store the speed of the car

    // Method that prints a message using the car's data
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}