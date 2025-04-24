package main.apr_may.example;


/**
 * 🚗 NewCar
 * This class demonstrates how to create a new car object and use its methods.
 */
public class NewCar {

    public static void main(String[] args) {
        // We create (instantiate) a Car object using the 'new' keyword
        Car myCar = new Car();

        // Assign values to the object's fields
        myCar.brand = "Toyota";
        myCar.speed = 120;

        // Call the drive() method to show what the car is doing
        myCar.drive(); // Output: Toyota is driving at 120 km/h
    }
}