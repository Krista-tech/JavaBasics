package main.jan2025;

public class ArraysLesson {
    public static void main(String[] args) {
        /**
         * Lesson: Java Arrays
         *
         * Why do we need arrays?
         * If we want to store multiple values, we can use separate variables.
         * However, managing multiple variables can become difficult.
         * Instead, we use arrays to store multiple values in a single variable.
         */
        System.out.println("Lesson: Java Arrays");

        // Declaring and initializing an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("\nExample: Here are some car brands stored in an array:");

        // Accessing elements
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        /**
         * Arrays allow easy access to elements using an index number.
         * For example, cars[0] gives us the first car in the list.
         */
        System.out.println("\nArrays allow easy access to elements using an index number.");
        System.out.println("For example, cars[0] gives us the first car in the list: " + cars[0]);

        /**
         * You can also change an element in an array.
         */
        System.out.println("\nYou can also change an element in an array.");
        cars[0] = "Tesla"; // Changing the first element
        System.out.println("Now the first car is: " + cars[0]);

        // Example with integers
        int[] myNum = {10, 20, 30, 40};
        System.out.println("\nExample: Here are some numbers stored in an array:");

        for (int num : myNum) {
            System.out.println(num);
        }

        /**
         * Arrays help us organize data efficiently and reduce repetition.
         * Using arrays, we can loop through values, change them, and store as many as needed.
         */
        System.out.println("\nArrays help us organize data efficiently and reduce repetition.");
        System.out.println("Using arrays, we can loop through values, change them, and store as many as needed.");

        // Task
        System.out.println("\nTask: Try adding more values to the array and printing them!");
    }
}
